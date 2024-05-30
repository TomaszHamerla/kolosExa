package com.example.kolosexample.service;

import com.example.kolosexample.model.Student;
import com.example.kolosexample.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
private final StudentRepository repository;

public List<Student> getStudentsFromPolibuda(){
    return repository.findAllBySchoolName("Politechnika");
}
}
