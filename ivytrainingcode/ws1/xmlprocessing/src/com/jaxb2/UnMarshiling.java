package com.jaxb2;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshiling {
 public static void main(String[] args) throws JAXBException {
  // xml---> java object
  JAXBContext context=JAXBContext.newInstance(Employee.class);
  
  Unmarshaller unmarshaller=context.createUnmarshaller();
  
  Employee employee=(Employee) unmarshaller.unmarshal(new File("demo.xml"));
  System.out.println(employee);
  
 }
}

