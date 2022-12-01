package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Dataset;
import com.example.demo.Repository.DatasetRepository;
@Service
public class DatasetService {
	
	@Autowired
	private DatasetRepository drepo;

	public Dataset save(Dataset dataset) {
		// TODO Auto-generated method stub
		return drepo.save(dataset);
		
	}

}
