 /**
 * 
 */
package com.abcbank.loantrack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author kosunil
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ApplicationIdException1 extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApplicationIdException1(String msg) {
		super(msg);
	}

}
