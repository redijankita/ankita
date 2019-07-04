package com.springMail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springMail.service.MailServiceImpl;

@SpringBootApplication
public class SendMailApplication implements CommandLineRunner {

	@Autowired
	private MailServiceImpl mailservice;
	public static void main(String[] args) {
		SpringApplication.run(SendMailApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			mailservice.send("snehal.shelke@neosofttech.com", 
					"snehal.shelke@neosofttech.com"," hello", "Hi How's it");
			System.out.println("Success");
			
		}catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
	}

}
