package com.vish.sfmovies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@NamedQueries({
		@NamedQuery(name="UserDetails.findAll", query="SELECT usr FROM UserDetails usr ORDER BY usr.userName ASC"),
		@NamedQuery(name="UserDetails.findOne", query="SELECT usr FROM UserDetails usr WHERE usr.userName=:uUserName")
})

public class UserDetails {

	@Id
	@GenericGenerator(name="customUUID", strategy="uuid2")
	@GeneratedValue(generator="customUUID")
	private String id;
	
	private String firstName;
	private String lastName;
	
	@Column(unique=true)
	private String email;
	
	@Column(unique=true)
	private String userName;
	
	private String password;
	private String role;
	
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }

	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	public String getUserName() { return userName; }
	public void setUserName(String userName) { this.userName = userName; }

	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

	public String getRole() { return role; }
	public void setRole(String role) { this.role = role; }	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="+ userName + ", email=" + email
				+ ", password=" + password + ", role=" + role + "]";
	}
	
}
