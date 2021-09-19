package com.uday;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Triangle {

	public void draw() {
		System.out.println("drawn triangle");
	}
	
//	@Required
//	
//	public void initializeTriangle() {
//		System.out.println("init triangle");
//	}
//	
	@PostConstruct
	public void initializeTriangle() {
		System.out.println("init triangle");
	}
	
	@PreDestroy
	public void destroyTriangle() {
		System.out.println("Destruction level 3000");
	}
	
}
