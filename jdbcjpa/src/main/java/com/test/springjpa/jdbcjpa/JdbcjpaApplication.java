package com.test.springjpa.jdbcjpa;

import java.util.Date; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.log.LogDelegateFactory;


@SpringBootApplication
public class JdbcjpaApplication implements CommandLineRunner {
	//commandlinerunner is the spring boot jpa interface which 
	//
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Personjparepository jpadao;
	public static void main(String[] args) {
		SpringApplication.run(JdbcjpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(jpadao.findbyid(10003));
		System.out.println(jpadao.insertPerson(new Person("Satish2","Mumbai",new Date())));
		// Since person class constructor is overloaded
		//you can use one for insert and other for update
		
		System.out.println(jpadao.insertPerson(new Person(10003,"Satish1","Mumbai",new Date())));
		
	}

}
