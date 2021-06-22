package com.sapient.trg.service;

import java.time.LocalDate;
public class Person {
	private Integer personId;
	private String firstName;
	private String lastName;
	private LocalDate time;
	private Long mobile;
	
	//default(no-org) constructor
	public Person() {
		
	}
	
	//All-arg constructor
	public Person(Integer personId, String firstName, String lastName, LocalDate time, Long mobile) {
		super();
		if(firstName==null && lastName==null) {
			throw new IllegalArgumentException("Both firstname and lastname cannot be null");
		}
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.time = time;
		this.mobile = mobile;
	}

	
	
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getTime() {
		return time;
	}
	public void setTime(LocalDate time) {
		this.time = time;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
}
