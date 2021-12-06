package com.customerapp.web.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.customerapp.dao.exceptions.EmployeeNotFoundException;
import com.customerapp.dao.exceptions.ErrorDetails;

//ex handing in Spring REST it is using AOP concept
@RestController
@ControllerAdvice
public class ExHandlerController {
	//ResponseEntity is a bag contain 2 things status code + data
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorDetails> handle404Ex(Exception ex, WebRequest request){
		ErrorDetails details=new ErrorDetails();
		details.setContact("rgupta.metch@gmail.com");
		details.setDate(new Date());
		details.setErrorMessage(ex.getMessage());
		System.out.println(request.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
	}
}
