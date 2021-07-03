package com.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //Declares this class as a table for the database
public class OurEntity {
	
	/* Properties have to be defined as either private or public. Otherwise,
	they will be treated as variables and, hence, they wont be included in 
	the returned object that represents the class */ 
	//Note that these properties also form the columns of the table.
	@Id //Declares the id property as the primary key
	@GeneratedValue //For auto-generation of the value
	private Long id;
	
	private String username;
	private Integer phoneNumber;
	private String email;
	private String password;

	
	public OurEntity(Long id, String username, Integer phoneNumber, String email, String password) {
  		this.id = id;
		this.username = username;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}
	
	public OurEntity() {
		
	}
	/*Since this class is called to be returned as an object, all the methods are
	called inexplicitly/automatically and the properties they return form each 
	property of the returned object (which is this class). */
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "OurEntity [id=" + id + ", username=" + username 
				+ ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
}
