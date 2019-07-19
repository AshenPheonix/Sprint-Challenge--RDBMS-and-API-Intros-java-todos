package com.brandonporter.javatodobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JavaTodoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTodoBackendApplication.class, args);
    }

}
