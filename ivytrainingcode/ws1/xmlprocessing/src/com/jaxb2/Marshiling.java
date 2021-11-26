package com.jaxb2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshiling {

 public static void main(String[] args) throws JAXBException, FileNotFoundException {
  //java ---> xml
  Employee employee=new Employee(121, "anil", 78);
  
  JAXBContext context=JAXBContext.newInstance(Employee.class);
  
  Marshaller marshaller=context.createMarshaller();
  
  marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
  
  marshaller.marshal(employee, new FileOutputStream("demo.xml"));
  
  System.out.println("marshling is done");
 }
}

