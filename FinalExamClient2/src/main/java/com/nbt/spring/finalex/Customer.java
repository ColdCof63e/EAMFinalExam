package com.nbt.spring.finalex;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	
	@Id
	private String id;
	private String address;
    private String details;
	
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Customer(String id, String address, String details) {
		super();
		this.id = id;
		this.address = address;
		this.details = details;
	}
	public Customer() {
		super();
	}
    
    

}
