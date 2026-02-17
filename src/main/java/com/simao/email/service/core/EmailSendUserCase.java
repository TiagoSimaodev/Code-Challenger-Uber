package com.simao.email.service.core;

public interface EmailSendUserCase {

	//representa o caso de uso da aplicação/ regra de negocio.
	void sendEmail(String to, String subject, String body);

}
