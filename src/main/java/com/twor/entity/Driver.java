package com.twor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Driver")
public class Driver {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Integer rating;
	private boolean isAvailable;
	
	

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Driver(Integer driverId, String firstName, String lastName, String email, String password,
			Integer rating, boolean isAvailable) {
		super();
		this.id = driverId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.rating = rating;
		this.isAvailable = isAvailable;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer driverId) {
		this.id = driverId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Integer getRating() {
		return rating;
	}



	public void setRating(Integer rating) {
		this.rating = rating;
	}



	public boolean isAvailable() {
		return isAvailable;
	}



	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}



	@Override
	public String toString() {
		return "Tutor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", rating=" + rating + ", isAvailable="
				+ isAvailable + "]";
	}


}
