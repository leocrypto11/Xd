package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Student;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService lservice;

	@GetMapping("/loginuser")
	public String showLoginForm() {
		return "loginpage";
	}

	@PostMapping("/validateUser")
	public ModelAndView validation(HttpSession session, @RequestParam("sname") String sname,
			@RequestParam("pass") String pass) {
		Student s = lservice.validateUser(sname, pass);
		System.out.println(s);
		if (s != null) {
			session.setAttribute("stu", s);
			return new ModelAndView("redirect:/subject/showsubject");
		}
		return new ModelAndView("loginpage", "message", "Invalid Credentials...");

	}

}
