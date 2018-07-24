package com.oocl.employee.controller;

import com.oocl.employee.model.Company;
import com.oocl.employee.model.Employee;
import com.oocl.employee.service.CompanyService;
import com.oocl.employee.service.EmployeeService;
import com.oocl.employee.serviceImpl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/Company")
    @ResponseBody
    public List <Company> FindAllCompany() {
        return companyService.FindAllCompany();
    }

    @GetMapping("/Company/{id}")
    @ResponseBody
    public Company FindCompany(@PathVariable Integer id) {
        return companyService.FindCompany( id );
    }

    @GetMapping("/Company/{id}/employees")
    @ResponseBody
    public List<Employee> FindCompanyOfEmployee(@PathVariable Integer id) {
        return companyService.FindCompanyOfEmployee( id );
    }

    @GetMapping("/Company/page/{page}/pageSize/{pageSize}")
    @ResponseBody
    public List <Company> FindPagingEmployee(@PathVariable int page, @PathVariable int pageSize) {
        return companyService.FindPagingCompany( page, pageSize );
    }
//    @PostMapping("/Employees")
//    @ResponseBody
//    public Employee addEmployee(@RequestBody Employee employee) {
//        return companyService.AddEmployee( employee );
//    }
//
//    @DeleteMapping("/Employees/{id}")
//    @ResponseBody
//    public List <Employee> deleteEmployee(@PathVariable Integer id) {
//        return employeeService.DeleteEmployee( id );
//    }
//
//    @PutMapping("/Employees/{id}")
//    @ResponseBody
//    public List <Employee> updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) {
//        return employeeService.UpdateEmployee( id, employee );
//    }
//

//
//    @GetMapping("/Employees/sex/{sex}")
//    @ResponseBody
//    public List <Employee> FindMaleEmployee(@PathVariable String sex) {
//        return employeeService.FindMaleEmployee( sex );
//    }

}
