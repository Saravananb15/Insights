package com.Insights.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Insights.User.Model.UserModel;
import com.Insights.User.Service.UserServiceImpl;

@RestController
@RequestMapping("/Insights")
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;

	@GetMapping("/login")
	public String getHomeScreen(@RequestParam String username, @RequestParam String password) {
		return userServiceImpl.Authenticate(username,password);
	}
	
	@PostMapping("/register")
	public String register(@RequestBody UserModel userModel) {
		return userServiceImpl.register(userModel);
	}
}
