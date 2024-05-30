package com.example.kolosexample;

import com.example.kolosexample.model.School;
import com.example.kolosexample.model.Student;
import com.example.kolosexample.repository.SchoolRepository;
import com.example.kolosexample.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DBDataInitializer implements CommandLineRunner {
    private final StudentRepository studentRepository;
    private final SchoolRepository schoolRepository;
    @Override
    public void run(String... args) throws Exception {
        var ekonomik = new School("Uniwersytet Ekonomiczny","Katowice");
        var polibuda = new School("Politechnika", "Gliwice");
        schoolRepository.save(ekonomik);
        schoolRepository.save(polibuda);

        var Jan = new Student("Jan","Kowalski",20,ekonomik);
        var Alex = new Student("Alex","Olo",19,ekonomik);
        var Jhon = new Student("Jhon","Doe",40,ekonomik);
        var Doe = new Student("Doe","Jhon",34,ekonomik);
        
        var Ola = new Student("Ola","Alo",19,polibuda);
        var Aga = new Student("Aga","Flak",24,polibuda);
        var Piotr = new Student("Piotr","Nowy",18,polibuda);

        studentRepository.save(Jan);
        studentRepository.save(Alex);
        studentRepository.save(Jhon);
        studentRepository.save(Doe);
        studentRepository.save(Ola);
        studentRepository.save(Aga);
        studentRepository.save(Piotr);
    }
}
