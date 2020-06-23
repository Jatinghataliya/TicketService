package com.ticketservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ticketservice.exception.NoDataFoundException;

@ControllerAdvice
public class ErrorController {

	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<com.ticketservice.modal.Error> handleException(NoDataFoundException exception) {
		com.ticketservice.modal.Error error = new com.ticketservice.modal.Error();
		error.setErrorCode(200);
		error.setErrorMessage(exception.getMessage());
		return ResponseEntity.ok(error);
	}
	
}
