package com.oocl.employee.model;

import java.util.List;

public class Company {
    private List<Employee> employeeList;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List <Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List <Employee> employeeList) {
        this.employeeList = employeeList;

    }

    public Company(int id ,List <Employee> employeeList) {
        this.employeeList = employeeList;
        this.id = id;
    }

    public Company() {
    }
}
