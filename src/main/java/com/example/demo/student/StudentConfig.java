package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rinat = new Student(
                    "Rinat",
                    "rinat@mail.com",
                    LocalDate.of(2001, FEBRUARY, 19)
            );
            Student anjali = new Student(
                    "Anjali",
                    "anjali@mail.com",
                    LocalDate.of(2002, AUGUST, 17)
            );
            repository.saveAll(List.of(rinat, anjali));
        };
    }
}
