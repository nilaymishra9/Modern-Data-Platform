package com.deloitte.kafka;



public class CallMethods {

	public static void main(String[] args)  {
		
		try {
		System.out.print("test Hello ");
		
		String jsonString = "{\n"
				+ "    \"glossary\": {\n"
				+ "        \"title\": \"example glossary\",\n"
				+ "		\"GlossDiv\": {\n"
				+ "            \"title\": \"S\",\n"
				+ "			\"GlossList\": {\n"
				+ "                \"GlossEntry\": {\n"
				+ "                    \"ID\": \"SGML\",\n"
				+ "					\"SortAs\": \"SGML\",\n"
				+ "					\"GlossTerm\": \"Standard Generalized Markup Language\",\n"
				+ "					\"Acronym\": \"SGML\",\n"
				+ "					\"Abbrev\": \"ISO 8879:1986\",\n"
				+ "					\"GlossDef\": {\n"
				+ "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n"
				+ "						\"GlossSeeAlso\": [\"GML\", \"XML\"]\n"
				+ "                    },\n"
				+ "					\"GlossSee\": \"markup\"\n"
				+ "                }\n"
				+ "            }\n"
				+ "        }\n"
				+ "    }\n"
				+ "}";

		String xmlString = "<?xml version=\"1.0\"?>\n"
				+ "<Tests xmlns=\"http://www.adatum.com\">\n"
				+ "  <Test TestId=\"0001\" TestType=\"CMD\">\n"
				+ "    <Name>Convert number to string</Name>\n"
				+ "    <CommandLine>Examp1.EXE</CommandLine>\n"
				+ "    <Input>1</Input>\n"
				+ "    <Output>One</Output>\n"
				+ "  </Test>\n"
				+ "  <Test TestId=\"0002\" TestType=\"CMD\">\n"
				+ "    <Name>Find succeeding characters</Name>\n"
				+ "    <CommandLine>Examp2.EXE</CommandLine>\n"
				+ "    <Input>abc</Input>\n"
				+ "    <Output>def</Output>\n"
				+ "  </Test>\n"
				+ "  <Test TestId=\"0003\" TestType=\"GUI\">\n"
				+ "    <Name>Convert multiple numbers to strings</Name>\n"
				+ "    <CommandLine>Examp2.EXE /Verbose</CommandLine>\n"
				+ "    <Input>123</Input>\n"
				+ "    <Output>One Two Three</Output>\n"
				+ "  </Test>\n"
				+ "  <Test TestId=\"0004\" TestType=\"GUI\">\n"
				+ "    <Name>Find correlated key</Name>\n"
				+ "    <CommandLine>Examp3.EXE</CommandLine>\n"
				+ "    <Input>a1</Input>\n"
				+ "    <Output>b1</Output>\n"
				+ "  </Test>\n"
				+ "  <Test TestId=\"0005\" TestType=\"GUI\">\n"
				+ "    <Name>Count characters</Name>\n"
				+ "    <CommandLine>FinalExamp.EXE</CommandLine>\n"
				+ "    <Input>This is a test</Input>\n"
				+ "    <Output>14</Output>\n"
				+ "  </Test>\n"
				+ "  <Test TestId=\"0006\" TestType=\"GUI\">\n"
				+ "    <Name>Another Test</Name>\n"
				+ "    <CommandLine>Examp2.EXE</CommandLine>\n"
				+ "    <Input>Test Input</Input>\n"
				+ "    <Output>10</Output>\n"
				+ "  </Test>\n"
				+ "</Tests>";
		
		GenericJsonToXmlConvertor  callJson = new GenericJsonToXmlConvertor();
		//callJson.jsonToXmlTransformation(jsonString);
		callJson.jsonToXmlTransformation(jsonString,"<?xml version=\"1.0\" encoding=\"UTF-8\"?>",true);
		
		GenericXmlToJsonConvertor callXML = new GenericXmlToJsonConvertor();
		callXML.xmlToJsonConvertor(xmlString);
		
		
		}
		catch(Exception e){
			System.out.println("Inside Error Block");
			System.out.println("Exception Occured during the Method call, please call the correct method and Value should be true if you are passing the XML root " + e);
		}

	}

}
