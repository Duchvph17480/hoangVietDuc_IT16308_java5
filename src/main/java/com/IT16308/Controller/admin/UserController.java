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
		return "";
	}

	@PostMapping(value = "/store")
	public String store() {
		return "";
	}

	@GetMapping(value = "/edit", params = "id")
	public String edit() {
		return "";
	}

	@PostMapping(value = "/update", params = "id")
	public String update() {
		return "";
	}

	@PostMapping(value = "/delete", params = "id")
	public String delete() {
		return "";
	}

}
