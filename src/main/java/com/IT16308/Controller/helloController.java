package com.IT16308.Controller;

import java.util.Optional;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.IT16308.entity.User;
import com.IT16308.utils.uploadFileUtils;

@Controller
public class helloController {
	
	@Autowired
	private ServletContext app;
	@Autowired
	private uploadFileUtils uploadUtils;
	
	@RequestMapping("/hello")
	public String hello(Model ahihi, @RequestParam("name") Optional<String> name) {
		
		String	nameValue= !name.isPresent()?"IT16308":name.get();
		ahihi.addAttribute("ahihi", nameValue);
		User user = new User();
		//user.setName("Hoang Viet Duc");
		ahihi.addAttribute("myus", user);

		return "hello";

	}
	@PostMapping("/upload-hello")
	public String uploadFile( @RequestParam("upload_file") MultipartFile uploadFile) {
		this.uploadUtils.handleUploadFile(uploadFile);
		return "redirect:/hello";
	}
	//@ResponseBody
	@GetMapping("/hihi")
	public String test() {		
		return "redirect:/hello";
	}

}
