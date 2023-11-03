package com.fil.easmystay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	 @GetMapping("/homepage")
	    public String showHomePage() {
	        return "homepage";
	    }
	 
	 @GetMapping("/homepage2")
	    public String showHomePage2() {
	        return "homepage2";
	    }
}
