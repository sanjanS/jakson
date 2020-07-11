package com.wbl.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wbl.Employee;
import com.wbl.JavaToJson;

public class JavaToJsonTest {

	private JavaToJson javatojson; 
	
	@BeforeTest
	public void setUp(){
		 javatojson = new JavaToJson();
		
	}
	 @Test
	public void convertJavaToJson() throws IOException {
		 
		Employee em = new Employee();

		em.setFirstName("sumanth");
		em.setLastName("sanjan");
		em.setDateOfBirth("23/10/1996");
		em.setAddress("nsp");
		em.setCity("narsapuram");
		em.setState("Ap");
		
		String result = javatojson.convertJson(em);
		String expect = "[{  \"firstName\" : \"sumanth\",\n" + 
				"  \"dateOfBirth\" : \"23/10/1996\",\n" + 
				"  \"address\" : \"nsp\",\n" + 
				"  \"city\" : \"narsapuram\",\n" + 
				"  \"state\" : \"ap\",\n" + 
				"  \"lastName\" : \"sanjan\"}]";
				
		Assert.assertNotEquals(result, expect);
		
	}

	@Test
	public void convertJavaToJsonPassingNullValues() throws IOException {
		Employee em = null;
		String actualResult = javatojson.convertJson(em);
		Assert.assertEquals(actualResult, "null");
	}

	@Test
	public void convertJavaToJsonPassingEmpty() throws IOException {
		Employee em = new Employee();;
		String actual = javatojson.convertJson(em);
		String expect = "{\n" + 
				"  \"firstName\" : null,\n" + 
				"  \"dateOfBirth\" : null,\n" + 
				"  \"address\" : null,\n" + 
				"  \"city\" : null,\n" + 
				"  \"state\" : null,\n" + 
				"  \"lastName\" : null\n" + 
				"}";
		Assert.assertNotEquals(actual, expect);
	}

}
