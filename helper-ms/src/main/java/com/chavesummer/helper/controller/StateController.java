package com.chavesummer.helper.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chavesummer.helper.entity.StateEntity;
import com.chavesummer.helper.entity.StateRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/state/")
public class StateController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StateController.class);

	@Autowired
	private StateRepository repository;
	
	@RequestMapping(method={RequestMethod.GET},  
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StateEntity> retriveAll() {
		
		LOGGER.info("Retornar lista de estados!");
		
		List<StateEntity> list = repository.findAll();
		
		return list;
	}
	
	@RequestMapping(method= {RequestMethod.POST},
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertState(@RequestBody StateEntity state) {
		
		repository.save(state);
	}
}