package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();

    @PostConstruct
    private void initStudents() {
        Arrays.asList(
                "成吉思汗",
                "鲁班七号",
                "太乙真人",
                "钟无艳",
                "花木兰",
                "雅典娜",
                "芈月",
                "白起",
                "刘禅",
                "庄周",
                "马超",
                "刘备",
                "哪吒",
                "大乔",
                "蔡文姬"
        ).forEach(this::addStudent);
    }

    public void addStudent(String name) {
        students.add(new Student(students.size() + 1, name));
    }

    public List<Student> getStudents() {
        return students;
    }
}
