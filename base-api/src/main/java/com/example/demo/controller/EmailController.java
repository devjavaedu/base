package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.EmailDTO;
import com.example.demo.service.EmailService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/mail")
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping("/v1/send")
	public ResponseEntity<?> sendEmail(@RequestPart(name = "file", required = false) MultipartFile file, @RequestPart("mail") String mail) throws JsonMappingException, JsonProcessingException {
		EmailDTO email = new ObjectMapper().readValue(mail, EmailDTO.class);
		boolean success = emailService.sendEmail(file, email);
		if(success) {
			return ResponseEntity.ok().body("Email has been sended to " + email.getTo() + "!");
		}else {
			return ResponseEntity.internalServerError().body(email.toString());
		}
	}

}