package com.hexagonal.demo.ports.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexagonal.demo.ports.Port;
import com.hexagonal.demo.services.Service;
import com.hexagonal.demo.services.ShapeService;

@Component
public class ServiceLocatorPort implements Port{

	@Autowired
	ShapeService shapeService;
	
	public void connect() {
		// TODO Auto-generated method stub		
	}
	
	public Service getService(String serviceName) {
		if(serviceName.equals("SHAPE")) {
			return shapeService;
		}else 
			return null; 
	}
	
}
