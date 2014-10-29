package com.sap.cloud.sample.persistence;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;

	public Car() {
	}

	@Id
	private long id;
	private String licenseNum;
	private String brand;
	private String color;
	@OneToOne
	private Employee employee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String param) {
		this.licenseNum = param;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String param) {
		this.brand = param;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String param) {
		this.color = param;
	}

	public Employee getEmployee() {
	    return employee;
	}

	public void setEmployee(Employee param) {
	    this.employee = param;
	}

}