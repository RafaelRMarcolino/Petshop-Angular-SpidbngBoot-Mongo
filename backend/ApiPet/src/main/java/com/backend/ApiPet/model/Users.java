package com.backend.ApiPet.model;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "Users")
public class Users {
	
	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
	private long id;
	
	@NotBlank
	@Size(max = 100)
	@Indexed(unique = true)
	private String name;
	
	@NotBlank
	@Size(max = 30)
	@Indexed(unique = true)
	private String email;
	
	@NotBlank
	@Size(max = 12)
	@Indexed(unique = true)
	private String phone;
	
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	
	
	public Users() {
		
	}


	public Users(long id, @NotBlank @Size(max = 100) String name, @NotBlank @Size(max = 30) String email,
			@NotBlank @Size(max = 12) String phone, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.date = date;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", date=" + date + "]";
	}
}
