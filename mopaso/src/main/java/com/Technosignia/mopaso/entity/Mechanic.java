package com.Technosignia.mopaso.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mechanic {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		 Long id;
		 		 
		 String jcNumber;
		 	 
	     Customer customer;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getJcNumber() {
			return jcNumber;
		}

		public void setJcNumber(String jcNumber) {
			this.jcNumber = jcNumber;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
	     
		
	}

