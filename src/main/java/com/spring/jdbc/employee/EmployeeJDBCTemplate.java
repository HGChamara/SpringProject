package com.spring.jdbc.employee;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.EmployeeDAO;

public class EmployeeJDBCTemplate implements EmployeeDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);

	}

	public void create(String first_name, String last_name, String email) {
		String sql = "insert into employee (first_name,last_name,email) values (?,?,?)";
		jdbcTemplateObject.update(sql, first_name,last_name,email);
	}

	public Employee getEmployee(Integer id) {
		String sql = "select * from employee where id=?";
		Employee emp = jdbcTemplateObject.queryForObject(sql, new Object[] {id},new EmployeeMapper());
		return emp;
	}

	public List<Employee> listEmployees() {
		String sql = "select * from employee";
		List<Employee> employees = jdbcTemplateObject.query(sql, new EmployeeMapper());
		return employees;
	}

	public void delete(Integer id) {
		String sql = "delete from employee where id=?";
		jdbcTemplateObject.update(sql, id);
	}

	public void update(Integer id, String email) {
		String sql = "update employee set email=? where id=?";
		jdbcTemplateObject.update(sql,email,id);

	}

}
