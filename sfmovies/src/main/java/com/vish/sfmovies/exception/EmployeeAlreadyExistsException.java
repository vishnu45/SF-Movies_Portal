package com.vish.sfmovies.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeAlreadyExistsException(String message) {
		super(message);
	}
	
	public EmployeeAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}
}