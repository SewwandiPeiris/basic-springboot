package edu.icet;

import edu.icet.model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student st = Student.builder().firstName("Kasun").lastName("Anuruddha").contactNumber("0987654321").build(); //builder

        Student st1 = new Student();
        st1.setFirstName("Sew");
        st1.setLastName("Mari");
        st1.setContactNumber("8675421093");

    }
}