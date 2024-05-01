package com.tunehub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private	int userId;
private String username;
private String email;
private String password;
private String number;
private String gender;
private String role;
private String adderess;
private String premium;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getAdderess() {
	return adderess;
}
public void setAdderess(String adderess) {
	this.adderess = adderess;
}
public String getPremium() {
	return premium;
}
public void setPremium(String premium) {
	this.premium = premium;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String username, String email, String password, String number, String gender, String role,
		String adderess, String premium) {
	super();
	this.userId = userId;
	this.username = username;
	this.email = email;
	this.password = password;
	this.number = number;
	this.gender = gender;
	this.role = role;
	this.adderess = adderess;
	this.premium = premium;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", password=" + password
			+ ", number=" + number + ", gender=" + gender + ", role=" + role + ", adderess=" + adderess + ", premium="
			+ premium + "]";
}


}