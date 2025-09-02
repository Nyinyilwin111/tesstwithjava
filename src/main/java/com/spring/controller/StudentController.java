//package com.spring.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.spring.model.Student;
//
//@Controller
//@RequestMapping("/student")
//public class StudentController {
//
//	@GetMapping("/register-form")
//	public ModelAndView showStudentForm() {
//		return new ModelAndView("Register","studObj", new Student());
//		
//	}
//	
//	@PostMapping("/saveStudent")
//	public String doRegister(@ModelAttribute("studObj") @Valid Student object,BindingResult br, Model m) { 
//		// -It links the form’s modelAttribute (in JSP) with the method parameter.
//		// -Without it, Spring wouldn’t know which form bean to use. 
//		
//		// studObj is Register.jsp of modelAttribute name
//		// object is Student class object
//		// The Model is used to pass data from controller → JSP (like a container of attributes).
//		if(br.hasErrors()) {
//			return "Register";
//		}
//		 m.addAttribute("object", object);
//
//	        return "Result"; // this is Result.jsp file name
//	}
//	
//	@ModelAttribute("hobbies")
//	public List<String> getAllHobbies(){
//		
//		List<String> hobbies = new ArrayList<>();
//		hobbies.add("Reading");
//		hobbies.add("Swimming");
//		hobbies.add("Singing");
//		
//		return hobbies;
//
//	}
//}
