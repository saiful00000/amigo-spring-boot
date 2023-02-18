package com.amigo.amigo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1, "shaiful", "shaiful@gmail.com", LocalDate.now(), 23),
                new Student(2, "shaiful", "shaiful@gmail.com", LocalDate.now(), 23)
        );
    }
}
