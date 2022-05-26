package com.IT16308.Controller.admin;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.IT16308.dto.UserDTO;
import com.IT16308.entity.User;
import com.IT16308.mappers.UserMapper;
import com.IT16308.repositories.UserRepository;

@Controller
@RequestMapping("/admin/users")
public class UserController {
	@Autowired
	private HttpServletRequest request;

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserMapper userMapper;

	@GetMapping()
	public String index(Model model) {
		List<User> listUser = this.userRepo.findAll();
		model.addAttribute("listUser", listUser);
		return "admin/users/index";
	}

//	@GetMapping(params = "id") // dựa vào tham số id để biết req có vào hàm này k . có param là id thì đi vào , k thì next
//	public String show(
//		@RequestParam(name = "id") Integer id // bóc dữ liệu từ request đưa vào biến
//	) {
//
//		return "admin/users/show";
//	}
	@GetMapping(value = "{id}")
	public String show(Model model, @PathVariable("id") User entity) {
		
		UserDTO userDTO= this.userMapper.convertToDTO(entity);
		model.addAttribute("user", userDTO);
		
		return "admin/users/show";
	}

	@GetMapping(value = "/create")
	public String create() {
		return "admin/users/create";
	}

	@PostMapping(value = "/store")
	public String store(Model model, @Valid UserDTO user, BindingResult result) {
		if (result.hasErrors()) {
			return "admin/users/create";
		} else {
			User entity = this.userMapper.convertToEntity(user);
			this.userRepo.save(entity);
			return "redirect:/admin/users";
		}
	}

	@GetMapping(value = "/edit/{id}")
	public String edit(Model model, @PathVariable("id") User entity) {
		UserDTO user = this.userMapper.convertToDTO(entity);
		model.addAttribute("user", entity);
		return "admin/users/edit";
	}

	@PostMapping(value = "/update/{id}")
	public String update(Model model, @Valid UserDTO user, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("user", user);
			return "admin/users/edit";
		} else {
			User entity = this.userMapper.convertToEntity(user);
			this.userRepo.save(entity);
			return "redirect:/admin/users";
		}

	}

	@PostMapping(value = "/delete/{id}")
	public String delete( @PathVariable("id") Integer id) {
		this.userRepo.deleteById(id);
		return "redirect:/admin/users";
	}

}
