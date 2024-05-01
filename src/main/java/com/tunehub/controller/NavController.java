package com.tunehub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
   @GetMapping(value="/login")
	public String login() {
		return "login";
	}
	@GetMapping(value="/registration")
	public String regestration() {
		return "registration";
	}
	@GetMapping(value="/addsongs")
	public String addSong() {
		return "song";
	}

	
}