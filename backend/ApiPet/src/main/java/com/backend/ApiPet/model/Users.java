package com.backend.ApiPet.model;

import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

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
	
	
	public Users() {
		
	}


	public Users(long id, @NotBlank @Size(max = 100) String name, @NotBlank @Size(max = 100) String email,
			@NotBlank @Size(max = 100) String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
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


	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
}
