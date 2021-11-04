package com.example.demo.dto;

import java.io.File;
import java.util.Objects;

public class EmailDTO {

	private String from;
	private String to;
	private String subject;
	private String message;
	private File attachment;

	public EmailDTO() {
		super();
	}

	public EmailDTO(String from, String to, String subject, String message, File attachment) {
		super();
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.message = message;
		this.attachment = attachment;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public File getAttachment() {
		return attachment;
	}

	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(attachment, from, message, subject, to);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailDTO other = (EmailDTO) obj;
		return Objects.equals(attachment, other.attachment) && Objects.equals(from, other.from)
				&& Objects.equals(message, other.message) && Objects.equals(subject, other.subject)
				&& Objects.equals(to, other.to);
	}

	@Override
	public String toString() {
		return "EmailDTO [from=" + from + ", to=" + to + ", subject=" + subject + ", message=" + message
				+ ", attachment=" + attachment + "]";
	}

}