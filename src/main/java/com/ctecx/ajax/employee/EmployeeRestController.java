package com.ctecx.ajax.employee;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeRestController {

	@Autowired
	private EmployeeService empservice;

	@RequestMapping(value = "/api/employees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> listAllEmp(@RequestParam(value = "q", required = false) String query) {
		
	      List<Employee>allemps= empservice.listAllEmployees(query);
          List<String> emps= new ArrayList<String>();
          
          for(Employee emp:allemps) {
        	  
        	  emps.add(emp.toString());
          }
          
          
          

		return emps;
	}

	@RequestMapping(value = "search", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> search(HttpServletRequest request) {
		return empservice.search(request.getParameter("term"));
	}

}
