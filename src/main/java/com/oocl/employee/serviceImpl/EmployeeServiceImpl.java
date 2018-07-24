package com.oocl.employee.serviceImpl;

import com.oocl.employee.EmployeeApplication;
import com.oocl.employee.model.Employee;
import com.oocl.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    private List <Employee> employeeList = EmployeeApplication.allEmployee();

    @Override
    public List <Employee> FindAllEmployee() {
        return employeeList;
    }

    @Override
    public Employee AddEmployee(Employee employee) {
        employeeList.add( employee );
        return employee;
    }

    @Override
    public List <Employee> DeleteEmployee(int id) {
        employeeList.remove( employeeList.stream()
                .filter( i -> i.getId() == id )
                .collect( Collectors.toList() )
                .get( 0 ) );
        return employeeList;
    }

    @Override
    public List <Employee> UpdateEmployee(int id, Employee employee) {
        for (Employee i : employeeList) {
            if (i.getId() == id) {
                i.setAge( employee.getAge() );
                i.setSalary( employee.getSalary() );
                i.setSex( employee.getSex() );
                i.setName( employee.getName() );
            }
        }
        return employeeList;
    }

    @Override
    public Employee FindEmployee(int id) {
        return employeeList.stream()
                .filter( i -> i.getId() == id )
                .collect( Collectors.toList() )
                .get( 0 );
    }

    @Override
    public List <Employee> FindMaleEmployee(String male) {
        return employeeList.stream()
                .filter( i -> i.getSex() == "male" )
                .collect( Collectors.toList() );
    }

    @Override
    public List <Employee> FindPagingEmployee(int page, int pageSize) {
        return employeeList.stream()
                .skip( pageSize * (page - 1) )
                .limit( pageSize )
                .collect( Collectors.toList() );
    }
}
