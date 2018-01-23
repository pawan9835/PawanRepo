package com.jio.utill;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Component
public class SendMail {

	@Autowired
	private JavaMailSender mailSender;

	public void sendMail(String address, String subject, String text, final CommonsMultipartFile file) {

		try {
			MimeMessage message = mailSender.createMimeMessage();

			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			
			   helper.setSubject(subject);
			   helper.setText(text);
			   helper.setTo(address);

			  mailSender.send(message);
			  
			  System.out.println("Sent *****************");
		} catch (Exception e) {
			System.out.println("Excepption in Mailsender  " + e);
		}

	}
}
