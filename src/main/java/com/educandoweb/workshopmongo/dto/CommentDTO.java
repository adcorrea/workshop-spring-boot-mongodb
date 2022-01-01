package com.educandoweb.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO authos;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String text, Date date, AuthorDTO authos) {
		super();
		this.text = text;
		this.date = date;
		this.authos = authos;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthos() {
		return authos;
	}

	public void setAuthos(AuthorDTO authos) {
		this.authos = authos;
	}
	
	
}
