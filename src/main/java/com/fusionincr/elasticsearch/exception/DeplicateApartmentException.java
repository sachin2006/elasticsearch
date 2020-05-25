/**
 * 
 */
package com.fusionincr.elasticsearch.exception;

/**
 * @author sachin
 *
 */
public class DeplicateApartmentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DeplicateApartmentException(String message)
	{
		super(message);
	}
	
	public DeplicateApartmentException(String message, Exception e)
	{
		super(message, e);
	}
}
