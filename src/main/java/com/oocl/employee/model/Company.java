package com.oocl.employee.model;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals( employeeList, company.employeeList ) &&
                Objects.equals( id, company.id );
    }

}
