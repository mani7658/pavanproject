package com.tunehub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tunehub.entity.User;

@Service
public interface UserService {

public void postUser(User user);
public User emailExist(User user);
public boolean validUser(String email, String password);
public String getRole(String email);

}