package com.example.kolosexample.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    public Student(String firstName, String lastName, int age, School school) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.school = school;
    }
}
