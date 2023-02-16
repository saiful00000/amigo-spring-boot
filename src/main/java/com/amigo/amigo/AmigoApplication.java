package com.amigo.amigo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigo.amigo.student.Student;

@SpringBootApplication
public class AmigoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigoApplication.class, args);
    }

}
