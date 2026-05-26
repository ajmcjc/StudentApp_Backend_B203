package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	private Integer pincode;
	private String area;
	private String city;
	
	public Integer getAid() { return aid; }

	public void setAid(Integer aid) { this.aid = aid; }

	public Integer getPincode() { return pincode; }
	
	public void setPincode(Integer pincode) { this.pincode = pincode; }
	
	public String getArea() { return area; }
	
	public void setArea(String area) { this.area = area; }
	
	public String getCity() { return city; }
	
	public void setCity(String city) { this.city = city; }
	
}
