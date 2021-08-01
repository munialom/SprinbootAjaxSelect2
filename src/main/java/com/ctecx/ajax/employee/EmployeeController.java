package com.ctecx.ajax.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	
	@GetMapping()
	public String lisEmployee(Model model) {
		
		Employee emp = new Employee();
		
		
		model.addAttribute("emps", emp);

		return "newEmp";
	}

}
