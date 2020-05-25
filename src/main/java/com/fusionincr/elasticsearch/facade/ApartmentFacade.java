/**
 * 
 */
package com.fusionincr.elasticsearch.facade;

import com.fusionincr.elasticsearch.data.ApartmentData;
import com.fusionincr.elasticsearch.exception.DeplicateApartmentException;

/**
 * @author sachin
 *
 */
public interface ApartmentFacade {

	public ApartmentData addApartment(ApartmentData data) throws DeplicateApartmentException;
	
	public ApartmentData updateApartment(ApartmentData data);
	
	public void deleteApartment(ApartmentData data);
	
}
