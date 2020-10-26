package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;


import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	

	@Override
	public List<Department> getAllDepartments() {
		
		List<Department> theDepartments = new ArrayList<>();
		String displayAllDepartments = "SELECT department_id, name FROM department" ; 											// this is my query. next I need to execute query
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(displayAllDepartments); 													//What we will get back, pass in query. No 'WHERE' clause so thats the only parameter we will need.
		
		while(rowSet.next()) {																									// then loop through because we are going to get multiple rows
			Department theDepartment = mapRowToDepartment(rowSet);
			theDepartments.add(theDepartment);																												// 2. Add to list
		}
		return theDepartments;
	}
	

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		
		List<Department> theDepartments = new ArrayList<>();
		String displayAllDepartments = "SELECT department_id, name FROM department WHERE name LIKE ?";
		
		nameSearch = "%" + nameSearch + "%";
		
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(displayAllDepartments, nameSearch);
		
		while(rowSet.next()) {
			Department theDepartment = mapRowToDepartment(rowSet);
			theDepartments.add(theDepartment);
			}
		return theDepartments;
	}
	


	@Override
	public void saveDepartment(Department updateDepartment) {
		String insertIntoDepartment = "UPDATE department SET name = ? WHERE department_id = ?";
		
		
		jdbcTemplate.update(insertIntoDepartment, updateDepartment.getName(), updateDepartment.getId());
		
	}
	

	@Override
	public Department createDepartment(Department newDepartment) {
		
		String insertDepertment = "INSERT INTO department (department_id, name) " +
								  " VALUES (DEFAULT, ?)";

		jdbcTemplate.update(insertDepertment, newDepartment.getName());
		 
	return newDepartment;
}
	
	

	@Override
	public Department getDepartmentById(Long id) {
		
		String getDepartmentById = "SELECT department_id, name FROM department WHERE department_id = ?";
		
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(getDepartmentById, id);
		
		if (rowSet.next()) {
			
			return mapRowToDepartment(rowSet);
		} else {
			
			return null;
		}
	}
	
	
	
	
	
	private Department mapRowToDepartment (SqlRowSet rowSet) {	
	Department theDepartment = new Department();
	
	Long id = rowSet.getLong("department_id");
	theDepartment.setId(id);
	
	String name = rowSet.getString("name");
	theDepartment.setName(name);

	return theDepartment;
	}
}
	

	




