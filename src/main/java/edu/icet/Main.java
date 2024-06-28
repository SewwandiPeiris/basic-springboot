package edu.icet;

import edu.icet.controller.studentController;
import edu.icet.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
        //Until today, we run java method through the main method.
        //But today, we run java method through the browser by using spring boot.
    }
}