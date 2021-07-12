package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private int id;
	private String model;
	private int yearOfManufacture;
	private int kilometer;
	private String status;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public int getKilometer() {
		return kilometer;
	}
	public void setKilometer(int kilometer) {
		this.kilometer = kilometer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Car(int id,String model, int yearOfManufacture, int kilometer, String status) {
		super();
		this.id=id;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.kilometer = kilometer;
		this.status = status;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", yearOfManufacture=" + yearOfManufacture + ", kilometer="
				+ kilometer + ", status=" + status + "]";
	}
	
}
