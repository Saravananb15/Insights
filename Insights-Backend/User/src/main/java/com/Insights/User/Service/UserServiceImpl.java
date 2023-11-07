package com.Insights.User.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insights.User.Entity.UserEntity;
import com.Insights.User.Model.UserModel;
import com.Insights.User.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public String Authenticate(String userName, String password) {
		if (userRepo.findByUsernameAndPassword(userName, password) != null) {
			return "Authenticated";
		}
		return "Not Authenticated";
	}
	@Override
	public String register(UserModel userModel) {
			if(userModel.getPassword().equals(userModel.getConfirmPassword())) {
				saveToDb(userModel);
				return "registered successfully";
			}else {
				return "Password and confirm password Mismatch";
			}
			
		}

	
	private void saveToDb(UserModel userModel) {
		UserEntity userEntity = new UserEntity();
		userEntity.setEmailId(userModel.getEmailId());
		userEntity.setMobilenumber(userModel.getMobileNumber());
		userEntity.setName(userModel.getName());
		userEntity.setPassword(userModel.getPassword());
		userEntity.setUsername(userModel.getPreferedUserName());
		userRepo.save(userEntity);
	}
}
