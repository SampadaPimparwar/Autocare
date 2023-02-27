package com.example.Technosignia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Technosignia.dao.BatchRepository;
import com.example.Technosignia.entity.Batch;

@Service
public class BatchService {
	@Autowired
	BatchRepository batchRepository;
	
	public Batch createBatch(Batch batch) {
		return batchRepository.save(batch);
	}
	
	public Optional<Batch> findBatchById(Long id){
		return batchRepository.findById(id);
	}
	
	public Batch updateBatch(Batch batch, Long id) {
		Optional<Batch> btCust=batchRepository.findById(id);
		Batch batc=btCust.get();
		batc.setBatchno(batch.getBatchno());
		batc.setBatchtime(batch.getBatchtime());
		return batchRepository.save(batc);
	}
	
	public String deleteBatch(Long id) {
		batchRepository.deleteById(id);
		return "Successfully deleted";
	}

}
