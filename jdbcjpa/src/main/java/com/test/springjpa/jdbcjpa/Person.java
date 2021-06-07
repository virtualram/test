package com.test.springjpa.jdbcjpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Person {
    @Id
    @GeneratedValue
	private int id;
	private String name;
	private String Location;
	private Date birth_date;
	public Person() {

	}

	public Person(int id,String name, String location, Date birth_date) {
		super();
		this.id   = id;
		this.name = name;
		this.Location = location;
		this.birth_date = birth_date;
	}// you need to create this two overload constructor one for update and one for insert use,without id
	
	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.Location = location;
		this.birth_date = birth_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Date getbirth_date() {
		return birth_date;
	}

	public void setbirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}


	@Override
	public String toString() {
		return String.format("\nPerson [id=%s, name=%s, location=%s, birthDate=%s]", id, name, getLocation(), birth_date);
	}



}
