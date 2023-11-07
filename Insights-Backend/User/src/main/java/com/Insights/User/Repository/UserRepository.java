package com.Insights.User.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Insights.User.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
		Optional<UserEntity> findByUsernameAndPassword(String userName,String password);
		Optional<UserEntity> findByUsername(String username);
	
}
