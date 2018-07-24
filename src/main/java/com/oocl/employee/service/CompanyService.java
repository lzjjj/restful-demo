package com.oocl.employee.service;

import com.oocl.employee.model.Company;
import com.oocl.employee.model.Employee;

import java.util.List;

public interface CompanyService {
    public List<Company> FindAllCompany();
    public Company AddCompany(Company company);
    public List<Company> DeleteCompany(int id);
    public List<Company> UpdateCompany(int id,Company company);
    public Company FindCompany(int id);
    public List<Company> FindMaleCompany(String male);
    public List<Company> FindPagingCompany(int page, int pageSize);
    public List<Employee> FindCompanyOfEmployee(int i);
}
