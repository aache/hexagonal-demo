package com.hexagonal.demo.adapters;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexagonal.demo.services.ShapeService;

public class AndroidShapeViewAdapter {

	@Autowired
	ShapeService service ;
	
	public void displayShapes() {
		service.getAllShapes();
	}
}
