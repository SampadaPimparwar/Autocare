package com.example.Technosignia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Technosignia.entity.Batch;
import com.example.Technosignia.service.BatchService;

@RestController
public class BatchController {
	@Autowired
	BatchService batchService;
	
	@PostMapping("/batch")
	public Batch createBatch(@RequestBody Batch batch) {
		return batchService.createBatch(batch);
	}
	
	@GetMapping("/batch/{id}")
	public Optional <Batch> findBatchById(@PathVariable Long id){
		return batchService.findBatchById(id);
	}
	
	@PutMapping("/batch")
	public Batch updateBatch(@RequestBody Batch batch,@RequestParam Long id) {
		return batchService.updateBatch(batch,id);
	}
	
	@DeleteMapping("/batch")
	public String deleteBatchById(Long id) {
		return batchService.deleteBatch(id);
	}

}
