package com.bt.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp")
public class LoginController {
	
	@GetMapping("")
	public String loginPage() {
		return "index";
		
	}

}
