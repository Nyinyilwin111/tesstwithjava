package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.User;
import com.spring.service.UserService;

@Controller
@RequestMapping("/user")
public class RegisterController {

	@Autowired
	UserService userService;
	
	 @GetMapping("/register")
	    public ModelAndView showUserForm() {
	        return new ModelAndView("UserRegister", "userObj", new User());
	    }

	    // Handle form submission
	    @PostMapping("/saveUser")
	    public ModelAndView saveUser(@ModelAttribute("userObj") User user) {
	        userService.insertUser(user);  // Save user to DB
	        ModelAndView mav = new ModelAndView("UserRegister");
	        mav.addObject("userObj", new User()); // empty form after submit
	        mav.addObject("message", "User registered successfully!");
	        return mav;
	    }
	    
	    @GetMapping("/list")
	    public ModelAndView listUsers() {
	        List<User> users = userService.getAllUsers();
	        ModelAndView mav = new ModelAndView("UserList");
	        mav.addObject("users", users);
	        return mav;
	    }
}
