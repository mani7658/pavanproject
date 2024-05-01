package com.tunehub.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.User;
import com.tunehub.repository.UserRepository;
import com.tunehub.service.UserService;

@Service
public class UserServiceImpl implements UserService{
@Autowired	
UserRepository ur;

@Override
public void postUser(User user) {
	ur.save(user);
	
}
public User emailExist(User user) {
	User details=ur.findByEmail(user.getEmail());
	if(details==null) {
		return null;
	}
	else return user;
}
@Override
public boolean validUser(String email, String password) {
	User user=ur.findByEmail(email);
	
	
	if(user==null) {
		return false;
	}
	String dbpwd=user.getPassword();
	 if(password.equals(dbpwd)&&email.equals(user.getEmail())) {
			return true;
		}
		return false;
}
@Override
public String getRole(String email) {
     User user=ur.findByEmail(email);
     return user.getRole();
}

	

}