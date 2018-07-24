package com.oocl.employee.model;

import java.util.Objects;

public class Employee {
    private int id;
    private int age;
    private int salary;
    private String sex;
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                age == employee.age &&
                salary == employee.salary &&
                Objects.equals( sex, employee.sex ) &&
                Objects.equals( name, employee.name );
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
