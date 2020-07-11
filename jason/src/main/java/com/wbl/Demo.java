package com.wbl;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wbl.Patient;
/**
	 * @author Kanpuri
	 *
	 */

	public class Demo {

	 /**
	 * @param args args.
	 */
	  public static void main(String[] args) {
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.enable(SerializationFeature.INDENT_OUTPUT);

	    try {
	      Patient patient = new Patient();

	      patient.setFirstName("sumanth");
	      patient.setLastName("sanjan");
	      patient.setDateOfBirth("23/10/1996");
	      patient.setAddress("nsp");
	      patient.setCity("narsapuram");
	      patient.setState("ap");
	      patient.setZip("534375");
	      patient.setPhone("9999999999");

	      mapper.writeValue(new File("writePatient.json"),patient);
	    } catch (Exception e) {
	       e.printStackTrace();
	    }
	  }

}
