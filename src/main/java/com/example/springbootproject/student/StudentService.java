package com.example.springbootproject.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    @GetMapping
    public List<Student> getStudents() {
        return Arrays.asList(new Student(1L, "Edwin", "Munoz", LocalDate.of(1995, 11, 03), 25));
    };
}
