package com.IT16308.Controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin/users")
public class UserController {
	@Autowired
	private HttpServletRequest request;
	@GetMapping()
	public String index() {
		return "admin/users/index";
	}

//	@GetMapping(params = "id") // dựa vào tham số id để biết req có vào hàm này k . có param là id thì đi vào , k thì next
//	public String show(
//		@RequestParam(name = "id") Integer id // bóc dữ liệu từ request đưa vào biến
//	) {
//
//		return "admin/users/show";
//	}
	@GetMapping(value="{id}") 
	public String show( Model model,
		@PathVariable("id") Integer id 
	) {
		model.addAttribute("id",id);
		return "admin/users/show";
	}

	@GetMapping(value = "/create")
	public String create() {
		return "admin/users/create";
	}

	@PostMapping(value = "/store")
	public String store() {
		return "redirect:/admin/users";
	}

	@GetMapping(value = "/edit/{id}")
	public String edit() {
		return "admin/users/edit";
	}

	@PostMapping(value = "/update/{id}")
	public String update() {
		return "redirect:/admin/users";
	}

	@PostMapping(value = "/delete/{id}")
	public String delete() {
		return "redirect:/admin/users";
	}

}
