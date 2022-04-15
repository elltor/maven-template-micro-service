package com.elltor;

import com.elltor.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        User u = new User();
        u.setAge(10);
        u.setName("zhang san");
        SpringApplication.run(App.class, args);
    }

}
