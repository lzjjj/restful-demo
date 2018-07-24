package com.oocl.employee.model;

public class Employee {
    private int id;
    private int age;
    private int salary;
    private String sex;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Employee(int id, int age, int salary, String sex,String name) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
        this.name = name;
    }
    public Employee() {

    }
}
