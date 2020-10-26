package com.techelevator.projects.model.jdbc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) { 
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> theEmployees = new ArrayList<>();
		String displayAllEmployees = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "
										+ "FROM employee" ; 
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(displayAllEmployees);
		
		while(rowSet.next()) {
			Employee theEmployee = mapRowToEmployee(rowSet);
			theEmployees.add(theEmployee);
		}
		return theEmployees;
	}


	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> theEmployees = new ArrayList<>();
		String displayAllEmployees = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "
									+ "FROM employee WHERE first_name LIKE ? AND last_name LIKE ?";
		
		lastNameSearch = "%" + lastNameSearch + "%";
		
		firstNameSearch = "%" + firstNameSearch + "%";
		
		
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(displayAllEmployees, firstNameSearch, lastNameSearch);
		
		while(rowSet.next()) {
			Employee theEmployee = mapRowToEmployee(rowSet);
			theEmployees.add(theEmployee);
			}
		return theEmployees;
	}


	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		List<Employee> theEmployees = new ArrayList<>();
		
		String getEmployeeFromDept = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "
									+ "FROM Employee WHERE department_id = ?";
		
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(getEmployeeFromDept, id);
		
		while(rowSet.next()) {
			Employee theEmployee = mapRowToEmployee(rowSet);
			theEmployees.add(theEmployee);
			}
		return theEmployees;
		
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> theEmployees = new ArrayList<>();
		
		String employeesWithNoProject = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "
										+ "FROM employee WHERE employee_id "
										+ "NOT IN (Select DISTINCT employee_id FROM project_employee) ";
		
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(employeesWithNoProject);
		
		while(rowSet.next()) {
			Employee theEmployee = mapRowToEmployee(rowSet);
			theEmployees.add(theEmployee);
			}
		return theEmployees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> theEmployees = new ArrayList<>();
		
		String employeeByProjectId = "SELECT employee.employee_id, employee.department_id, employee.first_name, employee.last_name, employee.birth_date, employee.gender, employee.hire_date FROM employee "+
				"JOIN project_employee ON employee.employee_id = project_employee.employee_id "+
				"WHERE project_employee.project_id = ?";
	
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(employeeByProjectId, projectId);
		
		while(rowSet.next()) {
			Employee theEmployee = mapRowToEmployee(rowSet);
			theEmployees.add(theEmployee);
			}
		return theEmployees;
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		
		String changeEmployeeDept = "UPDATE employee SET department_id = ? WHERE employee_id = ?";
		
		jdbcTemplate.update(changeEmployeeDept, departmentId, employeeId);
		
	}
	
	
	private Employee mapRowToEmployee (SqlRowSet rowSet) {	
	Employee theEmployee = new Employee();
	
	Long employeeId = rowSet.getLong("employee_id");
	theEmployee.setId(employeeId);
	
	Long deptId = rowSet.getLong("department_id");
	theEmployee.setDepartmentId(deptId);
	
	String firstName = rowSet.getString("first_name");
	theEmployee.setFirstName(firstName);
	
	String lastName = rowSet.getString("last_name");
	theEmployee.setLastName(lastName);
	
	LocalDate birthDate = rowSet.getDate("birth_date").toLocalDate();
	theEmployee.setBirthDay(birthDate);
	
	char gender = rowSet.getString("gender").charAt(0);
	theEmployee.setGender(gender);
	
	LocalDate hireDate = rowSet.getDate("hire_date").toLocalDate();
	theEmployee.setHireDate(hireDate);
	
	
	return theEmployee;
	}

}
