package com.oocl.employee;

import com.oocl.employee.model.Company;
import com.oocl.employee.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeeApplication.class, args);

	}
    public static List<Employee> allEmployee( ){
        List<Employee> employeeList = new ArrayList <>(  );
        employeeList.add(new Employee( 1,30,5000,"male","TEST")  );
        employeeList.add(new Employee( 2,50,5000,"male" ,"TEST")  );
        employeeList.add(new Employee( 3,40,5000,"male" ,"TEST")  );
        employeeList.add(new Employee( 4,30,5000,"female" ,"TEST")  );
        employeeList.add(new Employee( 5,60,5000,"female" ,"TEST")  );
        employeeList.add(new Employee( 6,80,5000,"female" ,"TEST")  );
        employeeList.add(new Employee( 7,20,5000,"female" ,"TEST")  );
        employeeList.add(new Employee( 8,308,5000,"male" ,"TEST")  );
        return employeeList;
    }
    public static List<Company> allCompany( ){
        List<Company> companyList = new ArrayList <>(  );
        companyList.add(new Company(1,"JD", EmployeeApplication.allEmployee())  );
        companyList.add(new Company(2,"alibaba", EmployeeApplication.allEmployee())  );
        companyList.add(new Company( 3,"oocl",EmployeeApplication.allEmployee())  );
        companyList.add(new Company( 4,"lll",EmployeeApplication.allEmployee())  );
        companyList.add(new Company( 5,"gdf",EmployeeApplication.allEmployee())  );
        companyList.add(new Company( 6,"tt",EmployeeApplication.allEmployee())  );
        companyList.add(new Company( 7,"ghh",EmployeeApplication.allEmployee())  );
        companyList.add(new Company( 8,"jh",EmployeeApplication.allEmployee())  );
        companyList.add(new Company( 9,"jj",EmployeeApplication.allEmployee())  );
        companyList.add(new Company( 10,"ooo",EmployeeApplication.allEmployee())  );
        return companyList;
    }
}
