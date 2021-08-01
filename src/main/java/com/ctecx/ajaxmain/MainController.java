package com.ctecx.ajaxmain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/index")
public class MainController {
	
	@GetMapping()
    public String mainIndex() {
		
		return"index";
	}

}
