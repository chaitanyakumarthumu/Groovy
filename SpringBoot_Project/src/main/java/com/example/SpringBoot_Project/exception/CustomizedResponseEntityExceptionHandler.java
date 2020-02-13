package com.example.SpringBoot_Project.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception exception,WebRequest webRequest)
	{
		System.out.println("Exception class"); 
		UserException userException=new UserException(exception.getMessage(),new Date(),webRequest.getDescription(false));
		return new ResponseEntity<Object>(userException,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(UserNotFound.class)
	public final ResponseEntity<Object> handleUserException(UserException exception,WebRequest webRequest)
	{
		UserException userException=new UserException(exception.getMessage(),new Date(),webRequest.getDescription(false));
		return new ResponseEntity<Object>(userException,HttpStatus.NOT_FOUND);
	}
}
