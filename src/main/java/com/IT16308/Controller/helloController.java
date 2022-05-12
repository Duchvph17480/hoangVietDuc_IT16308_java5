package com.IT16308.Controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.IT16308.entity.User;

@Controller
public class helloController {
	@RequestMapping("/hello")
	public String hello(Model ahihi, @RequestParam("name") Optional<String> name) {
		
		String	nameValue= !name.isPresent()?"IT16308":name.get();
		ahihi.addAttribute("ahihi", nameValue);
		User user = new User();
		user.setName("Hoang Viet Duc");
		ahihi.addAttribute("myus", user);

		return "hello";

	}
	//@ResponseBody
	@GetMapping("/hihi")
	public String test() {		
		return "redirect:/hello";
	}

}
