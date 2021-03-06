package com.sap.hana.cloud.sample;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Collection;

@Entity
@NamedQuery(name = "AllEmployee", query = "select e from Employee e")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	public Employee() {
	}

	@Id
	private String id;
	private String iUser;
	private String firstName;
	private String lastName;
	@OneToOne(mappedBy = "employee")
	private Car car;
	@OneToMany
	private Collection<Claim> claim;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIUser() {
		return iUser;
	}

	public void setIUser(String param) {
		this.iUser = param;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String param) {
		this.firstName = param;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String param) {
		this.lastName = param;
	}

	public Car getCar() {
	    return car;
	}

	public void setCar(Car param) {
	    this.car = param;
	}

	public Collection<Claim> getClaim() {
	    return claim;
	}

	public void setClaim(Collection<Claim> param) {
	    this.claim = param;
	}

}
