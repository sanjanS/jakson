package com.wbl;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadValues {

	  /**
	 * @param args args
	 */
	  public static void main(String[] args) {
	    ObjectMapper mapper = new ObjectMapper();

	    try {
	      Patient patient = mapper.readValue(new File("writePatient.json"), Patient.class);
	      System.out.println(patient.toString());
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

}
