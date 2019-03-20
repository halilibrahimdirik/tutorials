package com.sample.service;

import java.util.HashMap;
import java.util.Map;

import com.sample.model.Employee;

public class EmployeeService {
	private static Map<Integer, Employee> employees = new HashMap<>();
	private static int id = 1;

	static {
		initializeEmployees();
	}

	private static void initializeEmployees() {
		Employee emp1 = new Employee();

		emp1.setFirstName("Chamu");
		emp1.setLastName("Majety");
		emp1.setId(id);
		id++;

		Employee emp2 = new Employee();
		emp2.setFirstName("Siva");
		emp2.setLastName("Ponnam");
		emp2.setId(id);
		id++;

		employees.put(emp1.getId(), emp1);
		employees.put(emp2.getId(), emp2);
	}

	public static Map<Integer, Employee> getAllEmployees() {
		return employees;
	}

	public static Employee getEmployee(int id) {

		Employee emp = employees.get(id);
		return emp;
	}

	public static Employee createEmployee(Employee employee) {
		Employee emp = new Employee();

		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setId(id);
		id++;
		return emp;
	}

}