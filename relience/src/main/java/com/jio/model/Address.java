package com.jio.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "docDetails")

public class Address {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int documentID;
	private Byte[]  document;
	private String state;
	private String city;
	private String contact;
	
	public int getDocumentID() {
		return documentID;
	}
	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Byte[] getDocument() {
		return document;
	}
	public void setDocument(Byte[] document) {
		this.document = document;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Address [documentID=" + documentID + ", document=" + Arrays.toString(document) + ", state=" + state
				+ ", city=" + city + ", contact=" + contact + "]";
	}
	
	
}
