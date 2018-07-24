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
    @PostMapping("/Company")
    @ResponseBody
    public Company addCompany(@RequestBody Company company) {
        return companyService.AddCompany( company );
    }
//
//    @DeleteMapping("/Employees/{id}")
//    @ResponseBody
//    public List <Employee> deleteEmployee(@PathVariable Integer id) {
//        return employeeService.DeleteEmployee( id );
//    }
//
    @PutMapping("/Company/{id}")
    @ResponseBody
    public List <Company> updateCompany(@RequestBody Company company, @PathVariable Integer id) {
        return companyService.UpdateCompany( id, company );
    }


//
//    @GetMapping("/Employees/sex/{sex}")
//    @ResponseBody
//    public List <Employee> FindMaleEmployee(@PathVariable String sex) {
//        return employeeService.FindMaleEmployee( sex );
//    }

}
