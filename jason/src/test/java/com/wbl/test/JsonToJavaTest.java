package com.wbl.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.wbl.Employee;
import com.wbl.JsonToJava;

public class JsonToJavaTest {

private JsonToJava jsontojava; 
	
	@BeforeTest
	public void setUp() {
		jsontojava = new JsonToJava();
	}
	
	@Test
	public void convertJsonToJava() throws JsonParseException, JsonMappingException, IOException {
		
		String str = "Employee.json";
		Employee emp = jsontojava.convertJava(str);
		Assert.assertEquals(emp.getFirstName(), "sumanth");
		Assert.assertEquals(emp.getLastName(), "sanjan");
		Assert.assertEquals(emp.getDateOfBirth(), "23/10/1996");
		Assert.assertEquals(emp.getAddress(), "nsp");
		Assert.assertEquals(emp.getCity(), "narsapuram");
		Assert.assertEquals(emp.getState(), "AP");
	}
	
	@Test
	public void passingNull() throws JsonParseException, JsonMappingException, IOException {
		String str = null;
		Employee emp = jsontojava.convertJava(str);
		Assert.assertEquals(emp, null);
		
	}
}
