package com.spring.jdbc.employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_jdbc.xml");
		EmployeeJDBCTemplate stTemp = (EmployeeJDBCTemplate)context.getBean("studentJdbcTemplate");
		stTemp.create("spring", "surname", "email");
		
		Employee emp = stTemp.getEmployee(4);
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getEmail());
		
		List<Employee> empList = stTemp.listEmployees();
		for(Employee employee : empList) 
		{
			System.out.println(employee.getFirstName());
		}
		
		stTemp.delete(4);
		stTemp.update(1, "new@email");
	}

}
