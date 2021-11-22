package com.sax;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Reading {

	public static void main(String[] args) throws SAXException, IOException {

		XMLReader reader=XMLReaderFactory.createXMLReader();
		reader.setContentHandler(new EmployeeHandler());
		reader.parse("company.xml");

	}
}
