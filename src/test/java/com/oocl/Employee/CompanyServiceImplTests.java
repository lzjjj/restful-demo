package com.oocl.Employee;

import com.oocl.employee.EmployeeApplication;
import com.oocl.employee.model.Company;
import com.oocl.employee.model.Employee;
import com.oocl.employee.serviceImpl.CompanyServiceImpl;
import com.oocl.employee.serviceImpl.EmployeeServiceImpl;
import com.oocl.employee.util.CompareList;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyServiceImplTests {

    @Test
    public void contextLoads() {
    }
    
    @Test
    public void should_return_all_companys_when_FindAllCompanys() {
        CompanyServiceImpl companyServiceImpl = new CompanyServiceImpl();
        List<Company> companyList = EmployeeApplication.allCompany();
        CompareList compareList = new CompareList();
        Assert.assertThat(compareList.isEqual(companyServiceImpl.FindAllCompany(),companyList),Is.is(true));
    }
    @Test
    public void should_return_a_company_when_FindCompany() {
        CompanyServiceImpl companyServiceImpl = new CompanyServiceImpl();
        List<Employee> employeeList = EmployeeApplication.allEmployee();
        Company company = new Company( 1,employeeList );
        Assert.assertThat(companyServiceImpl.FindCompany(1).equals( company ),Is.is(true));
    }
    @Test
    public void should_return_Employees_when_FindCompanyOfEmployee() {
        CompanyServiceImpl companyServiceImpl = new CompanyServiceImpl();
        List<Employee> employeeList = EmployeeApplication.allEmployee();
        CompareList compareList = new CompareList();
        Assert.assertThat(compareList.isEqual(companyServiceImpl.FindCompanyOfEmployee(1),employeeList),Is.is(true));
    }
    @Test
    public void should_return_different_list_when_FindPagingCompany() {
        CompanyServiceImpl companyServiceImpl = new CompanyServiceImpl();
        CompareList compareList = new CompareList();
        List<Company> list_page_1 = companyServiceImpl.FindPagingCompany(1,5);
        List<Company> list_page_2 = companyServiceImpl.FindPagingCompany(2,5);
        Assert.assertThat(compareList.isEqual(list_page_1,list_page_2),Is.is(false));
    }
    @Test
    public void should_return_a_Company_when_AddCompany() {
        CompanyServiceImpl companyServiceImpl = new CompanyServiceImpl();
        List<Employee> employeeList = EmployeeApplication.allEmployee();
        Company company = new Company( 1,employeeList );
        Assert.assertThat(companyServiceImpl.AddCompany(company),Is.is(company));
    }
}