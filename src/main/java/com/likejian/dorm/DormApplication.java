package com.likejian.dorm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.likejian.dorm.*.controller"})
public class DormApplication {

    public static void main(String[] args) {

        SpringApplication.run(DormApplication.class, args);
    }
}
