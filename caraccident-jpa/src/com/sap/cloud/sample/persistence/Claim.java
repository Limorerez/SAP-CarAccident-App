package com.sap.cloud.sample.persistence;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Claim implements Serializable {

	private static final long serialVersionUID = 1L;

	public Claim() {
	}

	@Id
	private long id;
	private String decription;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String param) {
		this.decription = param;
	}

}