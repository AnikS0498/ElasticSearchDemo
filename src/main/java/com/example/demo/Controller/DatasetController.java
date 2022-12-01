package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Dataset;
import com.example.demo.Service.DatasetService;

@RestController
@RequestMapping("/dataset")
public class DatasetController {
	
	@Autowired
	private DatasetService service;
	
	
	@PostMapping("/create")
    public ResponseEntity<String> insertDetails(@RequestBody Dataset dataset) {
        System.out.println("Created");
        service.save(dataset);
        return new ResponseEntity<String>("Success", HttpStatus.OK);
    }
	

}
