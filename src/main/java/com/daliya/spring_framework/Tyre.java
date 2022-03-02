package com.daliya.spring_framework;

public class Tyre {
	private String brand;

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	

}
