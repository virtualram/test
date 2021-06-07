package com.test.springjpa.jdbcjpa;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes =JdbcjpaApplication.class)
public class testdata {
	@Autowired
	Personjparepository jpadao;
    
	@Test
	public void testit() {
		jpadao.insertPerson(new Person("Satish2","Mumbai",new Date()));
		System.out.println(jpadao.findbyid(1));
	}
}
