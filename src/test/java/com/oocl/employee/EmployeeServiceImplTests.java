package com.oocl.employee;

import com.oocl.employee.model.Employee;
import com.oocl.employee.serviceImpl.EmployeeServiceImpl;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTests {

    @Test
    public void contextLoads() {
    }
    
    @Test
    public void should_return_all_employees_when_FindAllEmployee() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        List<Employee> employeeList = EmployeeApplication.allEmployee();
        System.out.println(employeeList.toString());
        Assert.assertThat(employeeService.FindAllEmployee(),Is.is(employeeList));
    }

}