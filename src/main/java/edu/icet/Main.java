package edu.icet;

import edu.icet.model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student st = new Student();

        st.setFirstName("Kasun").setLastName("Anuruddha").setContactNumber("0987654321"); //builder

        st.setFirstName("Kasun");
        st.setLastName("Anuruddha");
        st.setContactNumber("0987654321");
        System.out.println(st);
    }
}