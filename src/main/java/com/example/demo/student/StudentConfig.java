package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.LocalDate;
//import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student Mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gamil.com",
                    LocalDate.of(2000, JANUARY,12)

            );
            Student Alex = new Student(
                    "Alex",
                    "alex@gamil.com",
                    LocalDate.of(2005, FEBRUARY,12)

            );
            repository.saveAll(
                    List.of(Mariam, Alex)
            );
        };
    }

}
//@Configuration
//public class StudentConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(
//            StudentRepository repository){
//        return args -> {
//            Student Mariam = new Student(
//                    "Mariam",
//                    "Mariam.jamal@gamil.com",
//                    LocalDate.of(2000, JANUARY,12),
//                    21
//            );
//            Student Alex = new Student(
//                    "Alex",
//                    "Alex@gamil.com",
//                    LocalDate.of(2002, FEBRUARY,25),
//                    19
//            );
//            repository.saveAll(
//                    List.of(Mariam, Alex)
//            );
//        };
//    }
//}