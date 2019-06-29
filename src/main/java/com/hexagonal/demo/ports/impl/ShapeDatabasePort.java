package com.hexagonal.demo.ports.impl;

import org.springframework.stereotype.Component;

import com.hexagonal.demo.ports.Port;

@Component
public class ShapeDatabasePort implements Port{

	public void connect() {
		System.out.println("Connecting to shape database ...");
	}
	
	public void downloadShapes() {
		System.out.println("Downloading shapes ...");
	}

}
