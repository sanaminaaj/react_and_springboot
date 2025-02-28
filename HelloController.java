package com.example.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hi")
	public String hi() {
		return "hi";
	}
	@GetMapping("/contacts")
	public String contact() {
		return "contact ";
	}
}
