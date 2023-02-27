package com.example.Technosignia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Batch {
	@Id
	Long batchno;
	
	Long batchtime;

	public Long getBatchno() {
		return batchno;
	}

	public void setBatchno(Long batchno) {
		this.batchno = batchno;
	}

	public Long getBatchtime() {
		return batchtime;
	}

	public void setBatchtime(Long batchtime) {
		this.batchtime = batchtime;
	}
	

}
