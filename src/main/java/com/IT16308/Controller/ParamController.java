package com.IT16308.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParamController {
	@RequestMapping("param/hihi")
	public String hihi() {
		return "";
	}
}
