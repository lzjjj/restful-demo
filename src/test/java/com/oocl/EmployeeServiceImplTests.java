package com.oocl;

import com.oocl.model.Employee;
import com.oocl.serviceImpl.EmployeeServiceImpl;
import com.oocl.util.CompareList;
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
        CompareList compareList = new CompareList();
        Assert.assertThat(compareList.isEqual(employeeService.FindAllEmployee(),employeeList),Is.is(true));
    }
    @Test
    public void should_return_add_employees_when_AddEmployee() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Employee employee = new Employee( 55,1,5000,"男","sdsdfds"  );
        Assert.assertThat(employeeService.AddEmployee(employee),Is.is(employee));
    }
    @Test
    public void should_return_newList_when_DeleteEmployee() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CompareList compareList = new CompareList();
        List<Employee> afterDeleteList = employeeService.DeleteEmployee( 1 );
        List<Employee> list = employeeService.FindAllEmployee();
        Assert.assertThat(compareList.isEqual(afterDeleteList,list),Is.is(true));
    }
    @Test
    public void should_return_newList_when_UpdateEmployee() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CompareList compareList = new CompareList();
        Employee employee = new Employee( 55,1,5000,"男","sdsdfds"  );
        List<Employee> afterUpdateList = employeeService.UpdateEmployee( 1 ,employee);
        List<Employee> list = employeeService.FindAllEmployee();
        Assert.assertThat(compareList.isEqual(afterUpdateList,list),Is.is(true));
    }
}