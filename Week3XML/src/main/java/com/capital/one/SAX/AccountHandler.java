package com.capital.one.SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AccountHandler extends DefaultHandler{
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		String str = new String(ch, start, length);
		str = str.trim();
		System.out.println(str);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("/" + qName);
	}
	

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println(qName + ": ");
		for(int i = 0; i < attributes.getLength(); i++) {
			System.out.println("\t" + attributes.getValue(i));
		}
		
	}
}
