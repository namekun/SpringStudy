package com.test.pjt15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {
	
	@RequestMapping("/login") // GET방식은 default이기때문에 생략가능, Value도 생략가능
	public String login(Model model) {
		
		model.addAttribute("loginKey", "loginValue");
	
		return "login"; // login.jsp
	}
	
}
