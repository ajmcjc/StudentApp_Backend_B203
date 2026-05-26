package com.app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String sname;
	private String email;
	private String password;
	private String dob;
	private Long contact;
	private String batch;
	private String gender;
	private String[] courses;
	private Float fees;
	private String imageUrl;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public Integer getId() { return id; }

	public void setId(Integer id) { this.id = id; }

	public String getSname() { return sname;	}

	public void setSname(String sname) {	this.sname = sname; }

	public String getEmail() { return email;	}

	public void setEmail(String email) {	this.email = email; }

	public String getPassword() { return password; }

	public void setPassword(String password) { this.password = password;	}

	public String getDob() {	return dob;	}

	public void setDob(String dob) {	this.dob = dob; }

	public Long getContact() { return contact; }

	public void setContact(Long contact) { this.contact = contact; }

	public String getBatch() { return batch;	}

	public void setBatch(String batch) {	this.batch = batch; }

	public Address getAddress() { return address; }

	public void setAddress(Address address) { this.address = address;	}

	public String getGender() { return gender; }

	public void setGender(String gender) { this.gender = gender; }

	public String[] getCourses() { return courses; }

	public void setCourses(String[] courses) { this.courses = courses; }

	public Float getFees() { return fees; }

	public void setFees(Float fees) { this.fees = fees; }

	public String getImageUrl() { return imageUrl; }

	public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}

/*
{
    "sname":"abc",
    "email":"abc@gmail.com",
    "password":"abc111",
    "dob":"2010-04-19",
    "contact":"9765432190",
    "batch":"B101",
    "gender":"male",
    "courses":["java","spring"],
    "fees":10000.00,
    "imageUrl": "image-url",
    "address":{
        "pincode":"564321",
        "area":"Karve Nagar",
        "city":"Pune"
    }
}
*/