package com.oocl.employee.controller;

import com.oocl.employee.service.EmployeeService;
import com.oocl.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/Employees")
    @ResponseBody
    public List <Employee> FindAllEmployee() {
        return employeeService.FindAllEmployee();
    }

    @PostMapping("/Employees")
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.AddEmployee( employee );
    }

    @DeleteMapping("/Employees/{id}")
    @ResponseBody
    public List <Employee> deleteEmployee(@PathVariable Integer id) {
        return employeeService.DeleteEmployee( id );
    }

    @PutMapping("/Employees/{id}")
    @ResponseBody
    public List <Employee> updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) {
        return employeeService.UpdateEmployee( id, employee );
    }

    @GetMapping("/Employees/{id}")
    @ResponseBody
    public Employee FindEmployee(@PathVariable Integer id) {
        return employeeService.FindEmployee( id );
    }

    @GetMapping("/Employees/sex/{sex}")
    @ResponseBody
    public List <Employee> FindMaleEmployee(@PathVariable String sex) {
        return employeeService.FindMaleEmployee( sex );
    }
    @GetMapping("/Employees/page/{page}/pageSize/{pageSize}")
    @ResponseBody
    public List <Employee> FindPagingEmployee(@PathVariable int page,@PathVariable int pageSize) {
        return employeeService.FindPagingEmployee( page, pageSize);
    }
}
