package com.enzulode.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

	@GetMapping("/echo")
	public ResponseEntity<String> echoEndpoint(@RequestParam("msg") String message) {
		return ResponseEntity.ok("Message was: %s".formatted(message));
	}
}
