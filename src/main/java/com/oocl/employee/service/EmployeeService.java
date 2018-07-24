package com.oocl.employee.service;

import com.oocl.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> FindAllEmployee();
    public Employee AddEmployee(Employee employee);
    public List<Employee> DeleteEmployee(int id);
    public List<Employee> UpdateEmployee(int id,Employee employee);
    public Employee FindEmployee(int id);
    public List<Employee> FindMaleEmployee(String male);
    public List<Employee> FindPagingEmployee(int page, int pageSize);
}
