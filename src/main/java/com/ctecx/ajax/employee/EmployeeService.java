package com.ctecx.ajax.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmpoyeeRespository employeeRespository;

	public void saveEmployee(Employee emp) {

		employeeRespository.save(emp);

	}

	public List<Employee> listAllEmployees(String query) {

		return (List<Employee>) employeeRespository.findAll();
	}

	
	
	 public List<Employee> search(String keyword) {
	        return employeeRespository.search(keyword);
	    }
}
