package com.Insights.User.Service;

import com.Insights.User.Model.UserModel;

public interface UserService {
	
		public String Authenticate(String userName,String password);
		
		public String register(UserModel userModel);
}
