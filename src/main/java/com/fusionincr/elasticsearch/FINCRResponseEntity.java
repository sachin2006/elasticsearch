/**
 * 
 */
package com.fusionincr.elasticsearch;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author sachin
 * @param <T>
 *
 */
public class FINCRResponseEntity<T> extends ResponseEntity<T> {

	public FINCRResponseEntity(HttpStatus status) {
		super(status);
	}

}
