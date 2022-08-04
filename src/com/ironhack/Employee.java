package com.ironhack;

public class Employee {


    private String name;
    private String email;
    private int age;
    private int salary;

    public Employee(String name, String email, int age, int salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String result  = name + "\n" +
                "email = " + email  + "\n"+
                "age = " + age + "\n" +
                "salary= " + salary + "\n" +
                "=======";

        return result;
    }
}
