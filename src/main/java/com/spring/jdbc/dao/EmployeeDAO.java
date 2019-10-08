package com.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import com.spring.jdbc.employee.Employee;

public interface EmployeeDAO 
{
	public void setDataSource(DataSource ds);
	public void create(String first_name,String last_name, String email);
	public Employee getEmployee(Integer id);
	public List<Employee> listEmployees();
	public void delete(Integer id);
	public void update(Integer id, String email);
}
