package com.IT16308.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	@GetMapping("/login")
	public String loginGetForm() {
		return "login";
	}

	@PostMapping("/login")
	public String login(com.IT16308.beans.login login) {
		System.out.println(login.getEmail());
		return "login";
	}
}
