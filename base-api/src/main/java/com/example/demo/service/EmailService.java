package com.example.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.EmailDTO;
import com.example.demo.entity.Email;
import com.example.demo.repository.EmailRepository;

@Service
public class EmailService {

	private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private EmailRepository emailRepository;

	public boolean sendEmail(MultipartFile file,  EmailDTO emailDto) {

		boolean emailSent = false;

		if(file != null && !file.isEmpty()) {
	        emailDto.setAttachment(convertToFile(file));
			sendEmailWithAttachment(emailDto);
		}else {
			sendSimpleEmail(emailDto);
		}
		emailSent = true;

		return emailSent;

	}

	private File convertToFile(MultipartFile file) {

		File fileTemp = null;

		try {
			fileTemp = new File( file.getOriginalFilename() );
			FileOutputStream fos = new FileOutputStream( fileTemp );
	        fos.write( file.getBytes() );
	        fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        return fileTemp;
	}

	private void sendEmailWithAttachment(EmailDTO emailDto) {

		logger.info("Sending email with attachment {}", emailDto.toString());

		MimeMessage message = mailSender.createMimeMessage();

		try {

			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);

			messageHelper.setFrom(emailDto.getFrom());
			messageHelper.setTo(emailDto.getTo());
			messageHelper.setSubject(emailDto.getSubject());
			messageHelper.setText(emailDto.getMessage());
			messageHelper.addAttachment(emailDto.getAttachment().getName(), emailDto.getAttachment());

		} catch (MessagingException e) {
			logger.debug("Error at sending email with attachment!");
			e.printStackTrace();
		}

		mailSender.send(message);

		saveEmail(emailDto);

		logger.info("Email sended with attachment with success!", emailDto.toString());

	}

	private void sendSimpleEmail(EmailDTO emailDto) {

		logger.info("Sending email {}", emailDto.toString());

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(emailDto.getFrom());
		message.setTo(emailDto.getTo());
		message.setSubject(emailDto.getSubject());
		message.setText(emailDto.getMessage());

		mailSender.send(message);

		saveEmail(emailDto);

		logger.info("Email sended with success!", emailDto.toString());

	}
	
	private void saveEmail(EmailDTO emailDto) {

		try {
			byte[] bytes = null;
			if(emailDto.getAttachment() != null) {
				bytes = Files.readAllBytes(emailDto.getAttachment().toPath());
			}
			emailRepository.save(new Email(emailDto.getFrom(), emailDto.getTo(), emailDto.getSubject(), emailDto.getMessage(), bytes));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}