package com.simao.email.service.adapters;

public interface EmailSenderGateway {

	//representa o contrato da minha aplicação com o provedor de serviço de email 
	void sendEmail(String to, String subject, String body);
	
}
