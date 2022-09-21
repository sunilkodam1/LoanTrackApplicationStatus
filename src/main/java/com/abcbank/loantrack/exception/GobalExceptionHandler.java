/**
 * 
 */
package com.abcbank.loantrack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author kosunil
 *
 */

@ControllerAdvice
public class GobalExceptionHandler {
	
	@ExceptionHandler(value=ApplicationIdException1.class)
	public ResponseEntity<String> handleApplicatonIdNotFoundException()
	{
		return new ResponseEntity<String>("Application Id Not Found",HttpStatus.BAD_REQUEST);
	}

}
