//package com.spring.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//@RequestMapping("/Index")
//public class IndexContoller {
//
//	@RequestMapping(value="/index", method= RequestMethod.GET)
//	public String showIndex() {
////		return "Index";
//		return "redirect:selectMessage";
//		// redirect is mapping to mapping connect
//	}
//	
//	@GetMapping("/selectMessage")
//	public String showMessage(Model m) {
//		m.addAttribute("msg","Hello - springMVC");   //( variable , object )=> call in Index.js with variable
//		return "Index";
//	}
//	
//}
