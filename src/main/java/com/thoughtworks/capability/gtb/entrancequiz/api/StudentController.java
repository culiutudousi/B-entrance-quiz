package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//TODO GTB-知识点: - StudentController.java:12 根据restful实践，资源名一般是复数
@RequestMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {
    //TODO GTB-知识点: - StudentController.java:15 推荐使用构造器注入
    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    //TODO GTB-知识点: - StudentController.java:24 Post请求的传参方式，一般使用@RequestBody
    //TODO GTB-知识点: - StudentController.java:26 POST请求的返回状态码，是201
    public Integer addStudent(@RequestParam String studentName) {
        return studentService.addStudent(studentName);
    }
}
