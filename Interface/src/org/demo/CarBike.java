package org.demo;

public class CarBike implements Car,Bike,Bus {

	@Override
	public void honda() {
		System.out.println("nice");
		
	}

	@Override
	public void hero() {
	
		System.out.println("good");
	}

	@Override
	public void swift() {
		System.out.println("nice car");
		
	}

	@Override
	public void bmw() {
		System.out.println("good car");
	}
public static void main(String[] args) {
	CarBike c=new CarBike();
	
	c.hero();
	c.bmw();
	c.honda();
	c.swift();
	c.city();
	c.ac();
	c.valvo();
	
}

@Override
public void city() {
	System.out.println("city");
}

@Override
public void ac() {
	
	System.out.println("ac");
	
}

@Override
public void valvo() {
	System.out.println("valvo");
	
}
}
