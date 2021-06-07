package com.test.springjpa.jdbcjpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
//this is similar to jdbc dao,bridge between table and person class
@Repository
@Transactional
public class Personjparepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public Person findbyid(int id) {
		
		return entityManager.find(Person.class,id);
		//To make table persist and allow inserts in h2 
		// add this line to app,.properties
		//spring.jpa.defer-datasource-initialization=true
	}
	
public Person insertPerson(Person person) {
		
		return entityManager.merge(person);
		//To make table persist and allow inserts in h2 
		// add this line to app,.properties
		//spring.jpa.defer-datasource-initialization=true
	}
	
}
