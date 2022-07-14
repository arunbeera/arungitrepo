package com.bt.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myapp")
public class LoginController {
	
	@GetMapping("")
	public String loginPage() {
		return "index";
		
	}

}
