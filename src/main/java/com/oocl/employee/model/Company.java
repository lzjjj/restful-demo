package com.oocl.employee.model;

import java.util.List;
import java.util.Objects;

public class Company {
    private List<Employee> employeeList;
    private Integer id;
    private String companyName;
    private Integer employeeNumber;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

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

    public Company(int id ,String companyName,List <Employee> employeeList) {
        this.employeeList = employeeList;
        this.id = id;
        this.companyName = companyName;
        this.employeeNumber = employeeList!=null ? employeeList.size() :0;
    }

    public Company() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals( employeeList, company.employeeList ) &&
                Objects.equals( id, company.id ) &&
                Objects.equals( companyName, company.companyName ) &&
                Objects.equals( employeeNumber, company.employeeNumber );
    }


}
