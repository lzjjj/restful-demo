package com.oocl.employee.serviceImpl;

import com.oocl.employee.EmployeeApplication;
import com.oocl.employee.model.Company;
import com.oocl.employee.model.Employee;
import com.oocl.employee.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
    private List <Company> companyList = EmployeeApplication.allCompany();
    @Override
    public Company FindCompany(int id) {
        return null;
    }

    @Override
    public List <Company> FindMaleCompany(String male) {
        return null;
    }

    @Override
    public List <Company> FindPagingCompany(int page, int pageSize) {
        return null;
    }

    @Override
    public List <Company> FindAllCompany() {
        return companyList;
    }

    @Override
    public Company AddCompany(Company company) {
        return null;
    }

    @Override
    public List <Company> DeleteCompany(int id) {
        return null;
    }

    @Override
    public List <Company> UpdateCompany(int id, Company company) {
        return null;
    }
}
