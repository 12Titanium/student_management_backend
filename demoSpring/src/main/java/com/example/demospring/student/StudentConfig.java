package com.example.demospring.student;

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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student jackson = new Student(
                    "Jackson",
                    "jackson.roy@gmail.com",
                    LocalDate.of(1996, JUNE, 18)
            );

            repository.saveAll(
                    List.of(mariam, jackson)
            );
        };
    }
}
