package com.ironhack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Employee> employees0 = new ArrayList<>();

        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "jdoe@ironhack.com", 10, 30000),
                new Intern("John Doe Jr", "jdoejr@ironhack.com", 10, 30000),
                new Employee("Mary Doe", "mdoe@ironhack.com", 66, 70000),
                new Intern("Mary Doe Jr", "mdoejr@ironhack.com", 55, 40000),
                new Employee("Fernando Doe", "fdoe@ironhack.com", 20, 33000),
                new Employee("Yolanda Doe", "ydoe@ironhack.com", 17, 22000),
                new Employee("Juan Doe", "jdoe@ironhack.com", 60, 52000),
                new Employee("Nick Doe", "ndoe@ironhack.com", 16, 39000),
                new Employee("Anibal Doe", "adoe@ironhack.com", 33, 26000),
                new Employee("Hanna Doe", "hdoe@ironhack.com", 20, 30000)
        );

        FileWriter writer = new FileWriter("employees.txt", true);
        for (Employee e : employees) {
            writer.write(e.toString() + "\n");

        }
        writer.close();
    }

    Playable[] playables = {new AndroidPlayer(50), new iOSPlayer(20)};


}
