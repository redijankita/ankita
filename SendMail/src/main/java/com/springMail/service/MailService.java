package com.springMail.service;

public interface MailService {
	
	public void send(String toAddress,
			String fromAddress,String subject,String content) throws Exception;

}
