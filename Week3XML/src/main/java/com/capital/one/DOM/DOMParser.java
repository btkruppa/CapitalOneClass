package com.capital.one.DOM;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMParser {
	public List<Account> readAccounts(String filename) {
		List<Account> accounts = new ArrayList<Account>();

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filename);
			doc.getDocumentElement();
			System.out.println(doc.getDocumentElement().getNodeName());
			NodeList accountsList = doc.getDocumentElement().getChildNodes();
			for (int i = 0; i < accountsList.getLength(); i++) {
				Node account = accountsList.item(i);
				Account acc = new Account();
				if ("#text".equals(account.getNodeName())) {
					continue;
				} else {
					System.out.println("\t" + account.getNodeName() + " " + account.getAttributes().item(0));
					acc.setId(Integer.parseInt(account.getAttributes().item(0).getTextContent()));
					NodeList accountChildren = account.getChildNodes();
					for (int j = 0; j < accountChildren.getLength(); j++) {
						Node field = accountChildren.item(j);
						if ("#text".equals(field.getNodeName())) {
							continue;
						} else {
							System.out.println("\t\t" + field.getNodeName() + " " + field.getTextContent());
							if ("balance".equals(field.getNodeName())) {
								acc.setBalance(Double.parseDouble(field.getTextContent()));
							} else if ("customer".equals(field.getNodeName())) {
								acc.setOwner(field.getTextContent());
							}
						}

					}
					accounts.add(acc);
				}

			}

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

		return accounts;
	}
}
