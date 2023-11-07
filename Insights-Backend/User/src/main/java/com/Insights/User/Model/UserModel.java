package com.Insights.User.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserModel {
	private String Name;
	private String emailId;
	private String preferedUserName;
	private String password;
	private String confirmPassword;
	private String mobileNumber;
	
}
