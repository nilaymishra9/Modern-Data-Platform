package com.deloitte.kafka;

import org.json.JSONObject;
import org.json.XML;

public class GenericXmlToJsonConvertor {

	public GenericXmlToJsonConvertor() throws Exception{
		// TODO Auto-generated constructor stub
	}
	
	public String xmlToJsonConvertor (String xmlString) {
		
		JSONObject jsonString = XML.toJSONObject(xmlString);
		String finalXmlString = jsonString.toString();
		
		System.out.println("Converted XML file for the review " + finalXmlString);
		return finalXmlString;
		
	}

}
