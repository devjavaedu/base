package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public ResponseEntity<?> getHello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new ResponseEntity<String>(new Gson().toJson(String.format("Hello %s", name)), HttpStatus.OK);
	}

}
