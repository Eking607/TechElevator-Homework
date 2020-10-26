package com.techelevator.projects.model.jdbc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Project> getAllActiveProjects() {
		List<Project> theProjects = new ArrayList<>();
		
		String displayAllProjects = "SELECT project_id, name, from_date, to_date FROM project WHERE " +
									"(now() BETWEEN from_date AND to_date) OR " +
									"(now() > from_date AND to_date IS NULL) OR " +
									"(now() < to_date AND from_date IS  NULL)";
		
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(displayAllProjects);
		
		while (rowSet.next()) { 
			Project theProject = mapRowToProject(rowSet);
			theProjects.add(theProject);
		}
		return theProjects;
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String deleteEmployeeFromProject = "DELETE FROM project_employee WHERE project_id = ? AND employee_id = ?";
		
		jdbcTemplate.update(deleteEmployeeFromProject, projectId, employeeId);
		
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String addEMployeeToProject = "INSERT INTO project_employee (project_id, employee_id) VALUES (?, ?)";
		
		jdbcTemplate.update(addEMployeeToProject, projectId, employeeId);
		
	}
	
	
	private Project mapRowToProject (SqlRowSet rowSet) {	
		Project theProject = new Project();
		
		Long projectId = rowSet.getLong("project_id");
		theProject.setId(projectId);
		
		
		String name = rowSet.getString("name");
		theProject.setName(name);
		

		if(rowSet.getDate("from_date") != null) {
			LocalDate fromDate = rowSet.getDate("from_date").toLocalDate();
			theProject.setStartDate(fromDate);
		}
		if (rowSet.getDate("to_date") != null) {
			LocalDate toDate = rowSet.getDate("to_date").toLocalDate();
			theProject.setEndDate(toDate);
		}
	
		
		
		return theProject;
		}

	}

