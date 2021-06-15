package com.example.javaspringboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student edho = new Student(
                    "Edho",
                    "edho@gmail.com",
                    LocalDate.of(1997, 06, 8)
            );

            Student dwi = new Student(
                    "Dwi",
                    "dwi@gmail.com",
                    LocalDate.of(1997, 06, 8)
            );

            Student tirwanda = new Student(
                    "Dwi",
                    "tirwanda@gmail.com",
                    LocalDate.of(1997, 06, 8)
            );

            studentRepository.saveAll(
                    List.of(edho, dwi, tirwanda)
            );
        };
    }
}
