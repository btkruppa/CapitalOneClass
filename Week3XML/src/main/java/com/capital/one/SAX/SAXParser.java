package com.capital.one.SAX;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SAXParser {
	public void readAccounts(String filename) {
		SAXParserFactory fact = SAXParserFactory.newInstance();

		try {
			javax.xml.parsers.SAXParser parser = fact.newSAXParser();
			AccountHandler ah = new AccountHandler();
			parser.parse(filename, ah);	
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
