package com.example.Technosignia.entity;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import jakarta.persistence.Id;

public class Customer {
	@Id
	long id;
	
	String name;
	
	String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
