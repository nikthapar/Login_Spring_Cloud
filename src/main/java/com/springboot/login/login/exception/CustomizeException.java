package com.springboot.login.login.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.springboot.login.login.UserNotFoundException;
@RestController
@ControllerAdvice




public class CustomizeException 
extends ResponseEntityExceptionHandler{
@ExceptionHandler(UserNotFoundException.class)	
 public final ResponseEntity<Object> handleGernal(UserNotFoundException ex , WebRequest request){
	 ExceptionResponce obj = 
			 new ExceptionResponce (new Date() , ex.getMessage() , request.getDescription(false));
	 return new ResponseEntity(obj,HttpStatus.NOT_FOUND);
 }
}
