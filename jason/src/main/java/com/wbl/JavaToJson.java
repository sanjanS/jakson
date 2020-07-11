package com.wbl;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JavaToJson {	
	/**
	 * @param obj obj
	 * @return mp
	 * @throws IOException ioexception
	 */
	  public String convertJson(final Object obj) throws IOException {
	    ObjectMapper mp = new ObjectMapper();
	    mp.configure(SerializationFeature.INDENT_OUTPUT, true);
	    mp.writeValue(new File("Myjson.json"), obj);
	    return mp.writeValueAsString(obj);
	  }
}
