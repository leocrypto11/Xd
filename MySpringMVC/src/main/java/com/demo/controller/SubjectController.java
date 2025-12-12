package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Student;
import com.demo.beans.Subject;
import com.demo.service.SubjectService;

@Controller
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	SubjectService service;
	
	@GetMapping("/showsubject")
	public ModelAndView getAllProducts(HttpSession session) {
		Student s = (Student)session.getAttribute("stu");
		if(s != null) {
			List <Subject> lt  = service.getAllProducts();
			System.out.println(lt);
//			session.setAttribute("sublist", lt);
			return new ModelAndView("showsubject","sublist",lt);
		}else {
			 //return new ModelAndView("redirect:/login/loginuser")
			 return new ModelAndView("loginpage","message","pls provide credentials");
		}
		
	}
	
//	@GetMapping("/showsubject")
//	public String getAllProducts(HttpSession session) {
//		Student s = (Student)session.getAttribute("stu");
//		if(s != null) {
//			List <Subject> lt  = service.getAllProducts();
//			session.setAttribute("sublist", lt);
//			return "showsubject";
//		}else {
//			 //return new ModelAndView("redirect:/login/loginuser")
//			 return "loginpage";
//		}
//		
//	}
	
	
	@GetMapping("/addsubject")
	public String showsubjectform(Model myModel) {
		myModel.addAttribute("s1",new Subject());
		return "insertSubject";
		
	}
	
	@PostMapping("/insertsubject")
	//public ModelAndView insertProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty, @RequestParam double price, @RequestParam LocalDate mfgdate,@RequestParam int cid) {
	public ModelAndView insertSubject(@ModelAttribute Subject s) {
		boolean status=service.addsubject(s);
		System.out.println(s);
		return new ModelAndView("redirect:/subject/showsubject");
	}
	
	@GetMapping("/deletesubject/{sid}")
	public ModelAndView deleteSubject(@PathVariable int sid) {
		boolean status=service.deleteById(sid);
		return new ModelAndView("redirect:/subject/showsubject");
	}
	
	
	@GetMapping("/editsubject/{sid}")  
	public ModelAndView editSubject(@PathVariable("sid") int sid) {
		Subject s=service.getById(sid);
		System.out.println(s);
		if(s!=null) {
			return new ModelAndView("editsubject","subj",s);
		}else {
			return new ModelAndView("redirect:/subject/showsubject");
		}
		
	}
	
	@PostMapping("/updatesubject")
	public ModelAndView updateSubject(@ModelAttribute Subject s) {
		System.out.println(s);
		boolean status=service.updateproduct(s);
		return new ModelAndView("redirect:/subject/showsubject");
	}
	
}
