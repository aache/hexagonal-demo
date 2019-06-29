package com.hexagonal.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexagonal.demo.ports.impl.ShapeDatabasePort;
import com.hexagonal.demo.services.ShapeService;

public class ShapeServiceImpl implements ShapeService{

	@Autowired
	ShapeDatabasePort port;
	
	public void getAllShapes() {
		port.downloadShapes();
	}

}
