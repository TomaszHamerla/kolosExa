package com.example.kolosexample.controller;

import com.example.kolosexample.model.Student;
import com.example.kolosexample.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;

    @GetMapping("/polibuda")
    List<Student> getStudensFromPolibuda(){
        return service.getStudentsFromPolibuda();
    }
}
