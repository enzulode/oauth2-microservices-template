package com.enzulode.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
public class WelcomeController {

	@GetMapping("/greet")
	public ResponseEntity<String> greetEndpoint(@RequestParam("person") String person) {
		return ResponseEntity.ok("Hello, %s".formatted(person));
	}
}
