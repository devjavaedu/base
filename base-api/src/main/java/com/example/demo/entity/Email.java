package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name = "email")
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "email_from")
	private String from;

	@Column(name = "email_to")
	private String to;

	@Column(name = "subject")
	private String subject;

	@Column(name = "message")
	private String message;

	@Lob
	@Column(name = "attachment")
	private byte[] attachment;

	@Column(name = "send_date")
	private LocalDateTime sendDate;

	public Email() {
		super();
	}
	
	public Email(String from, String to, String subject, String message, byte[] attachment) {
		super();
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.message = message;
		this.attachment = attachment;
		this.sendDate = LocalDateTime.now();
	}

	public Email(Long id, String from, String to, String subject, String message, byte[] attachment,
			LocalDateTime sendDate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.message = message;
		this.attachment = attachment;
		this.sendDate = sendDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public byte[] getAttachment() {
		return attachment;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

	public LocalDateTime getSendDate() {
		return sendDate;
	}

	public void setSendDate(LocalDateTime sendDate) {
		this.sendDate = sendDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attachment, from, id, message, sendDate, subject, to);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		return Objects.equals(attachment, other.attachment) && Objects.equals(from, other.from)
				&& Objects.equals(id, other.id) && Objects.equals(message, other.message)
				&& Objects.equals(sendDate, other.sendDate) && Objects.equals(subject, other.subject)
				&& Objects.equals(to, other.to);
	}

	@Override
	public String toString() {
		return "Email [id=" + id + ", from=" + from + ", to=" + to + ", subject=" + subject + ", message=" + message
				+ ", attachment=" + attachment + ", sendDate=" + sendDate + "]";
	}

}