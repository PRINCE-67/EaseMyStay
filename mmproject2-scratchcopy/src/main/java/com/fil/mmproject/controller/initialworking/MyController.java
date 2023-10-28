package com.fil.mmproject.controller.initialworking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyController {

	@GetMapping("/home")
	public String getAddress() {
		System.out.println("Hii! Just an update. The One Piece is real.");
		return "Hii! Just an update. The One Piece is real.";
	}
	
	
}
