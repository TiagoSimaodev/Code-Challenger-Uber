package com.simao.email.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simao.email.service.application.EmailSendService;
import com.simao.email.service.core.EmailRequest;
import com.simao.email.service.core.exception.EmailServiceException;

@RestController
@RequestMapping("/api/email")
public class EmailSendController {

	private final EmailSendService emailSendService;
	
	@Autowired
	public EmailSendController(EmailSendService emailSendService) {
		this.emailSendService = emailSendService;
	}
	
	@PostMapping()
	public ResponseEntity<String> sendEmail (@RequestBody EmailRequest request) {
		try {
			this.emailSendService.sendEmail(request.to(), request.subject(), request.body());
			return ResponseEntity.ok("Email sendo successfully");
		}catch (EmailServiceException exception) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while sending email");
		}
	}
	
	
}
