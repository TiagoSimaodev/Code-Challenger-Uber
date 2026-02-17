package com.simao.email.service.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simao.email.service.adapters.EmailSenderGateway;
import com.simao.email.service.core.EmailSendUserCase;

@Service
public class EmailSendService implements EmailSendUserCase {

	private final EmailSenderGateway emailSendergateway;
	
	@Autowired
	public EmailSendService(EmailSenderGateway emailGateway) {
		this.emailSendergateway = emailGateway;
	}
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		this.emailSendergateway.sendEmail(to, subject, body);
	}

	
}
