package com.oocl.Employee;

import com.oocl.employee.EmployeeApplication;
import com.oocl.employee.model.Company;
import com.oocl.employee.serviceImpl.CompanyServiceImpl;
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
        Assert.assertThat(compareList.isEqual(companyList,companyList),Is.is(true));
    }

}