package com.Insights.User.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Insights")
public class HomeController {

	@GetMapping("/login")
	public String getHomeScreen() {
		return "Home";
	}
	
	@PostMapping("/register")
	public void register() {
		
	}
}
