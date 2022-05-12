package com.IT16308.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	@GetMapping("/login")
	public String login(@RequestParam("mail") String mail, @RequestParam("pass") String pass) {
		System.out.println(mail+pass);
		return "login";
	}
}
