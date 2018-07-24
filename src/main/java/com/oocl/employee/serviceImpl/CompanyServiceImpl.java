package com.oocl.employee.serviceImpl;

import com.oocl.employee.EmployeeApplication;
import com.oocl.employee.model.Company;
import com.oocl.employee.model.Employee;
import com.oocl.employee.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
    private List <Company> companyList = EmployeeApplication.allCompany();
    @Override
    public Company FindCompany(int id) {
        return companyList.stream().filter( i->i.getId()==id ).collect( Collectors.toList() ).get( 0 );
    }

    @Override
    public List <Employee> FindCompanyOfEmployee(int id) {
        return companyList.stream()
                .filter( i->i.getId()==id )
                .collect( Collectors.toList() )
                .get( 0 )
                .getEmployeeList();
    }

    @Override
    public List <Company> FindMaleCompany(String male) {
        return null;
    }

    @Override
    public List <Company> FindPagingCompany(int page, int pageSize) {
        return companyList.stream()
                .skip( pageSize * (page - 1) )
                .limit( pageSize )
                .collect( Collectors.toList() );
    }

    @Override
    public List <Company> FindAllCompany() {
        return companyList;
    }

    @Override
    public Company AddCompany(Company company) {
        companyList.add( company );
        return company;
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
