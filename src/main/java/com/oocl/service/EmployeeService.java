package com.oocl.service;

import com.oocl.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> FindAllEmployee();
    public Employee AddEmployee(Employee employee);
    public List<Employee> DeleteEmployee(int id);
    public List<Employee> UpdateEmployee(int id,Employee employee);
    public Employee FindEmployee(int id);
}
