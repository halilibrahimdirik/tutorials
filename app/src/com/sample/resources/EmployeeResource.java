package com.sample.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sample.model.Employee;
import com.sample.service.EmployeeService;

@Path("employees")
public class EmployeeResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees() {
		return new ArrayList<>(EmployeeService.getAllEmployees().values());
	}

	@GET
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("employeeId") int empId) {
		Employee emp = EmployeeService.getEmployee(empId);
		return emp;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Employee createEmployee(Employee emp) {
		Employee employee = EmployeeService.createEmployee(emp);
		return employee;
	}
}