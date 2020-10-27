package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupService {
    @Autowired
    StudentService studentService;

    private List<Integer> groups = new ArrayList<>();
    private final Integer groupNumber = 6;

    public List<Integer> getGroups() {
        return groups;
    }

    public void redistributeGroup() {
        List<Student> students = studentService.getStudents();
        List<Integer> studentNumbers = students.stream()
                .map(student -> student.getId() - 1)
                .collect(Collectors.toList());
        Collections.shuffle(studentNumbers);
        groups = studentNumbers.stream()
                .map(number -> number % groupNumber + 1)
                .collect(Collectors.toList());
    }
}
