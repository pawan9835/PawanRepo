package com.jio.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RelianceJioInfo_tab1")
public class RelienceJio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jioId;
	private String firstName;
	private String lastName;
	private String email;
	private String contactno;
	private Date   dob;
	private String gender;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Address user_address;

	public int getJioId() {
		return jioId;
	}

	public void setJioId(int jioId) {
		this.jioId = jioId;
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

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getUser_address() {
		return user_address;
	}

	public void setUser_address(Address user_address) {
		this.user_address = user_address;
	}

	@Override
	public String toString() {
		return "RelienceJio [jioId=" + jioId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", contactno=" + contactno + ", dob=" + dob + ", gender=" + gender + ", user_address="
				+ user_address + "]";
	}

	
	
	

}
