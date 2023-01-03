package com.deloitte.kafka;

import org.json.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class GenericJsonToXmlConvertor extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenericJsonToXmlConvertor() {

	}

	public GenericJsonToXmlConvertor(String errorMessage) {

		super(errorMessage);
	}

	public String jsonToXmlTransformation(String jsonString, String xmlRoot, Boolean rootRequired)
			throws JsonMappingException, JsonProcessingException, GenericJsonToXmlConvertor {

		// Method 1 : Convert a JSON String to XML and Return XML String back

		if (rootRequired == true) {
			JSONObject json = new JSONObject(jsonString);
			String xml = XML.toString(json);
			String finalXML = xmlRoot.concat(xml);
			System.out.println("XML Transformed String Methoh1 " + finalXML);

			return finalXML;
		}

		throw new GenericJsonToXmlConvertor("Not a Valid Method");

	}

	// Method Overwrite, converting JSON to XML just as a simple String
	public String jsonToXmlTransformation(String jsonString) throws JsonMappingException, JsonProcessingException {

		// Method 1 : Convert a JSON String to XML and Return XML String back

		JSONObject json = new JSONObject(jsonString);
		String xmlString = XML.toString(json);

		System.out.println("XML Transformed String " + xmlString);

		return xmlString;

	}

}
