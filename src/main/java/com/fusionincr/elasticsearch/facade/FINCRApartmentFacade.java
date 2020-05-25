/**
 * 
 */
package com.fusionincr.elasticsearch.facade;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fusionincr.elasticsearch.data.ApartmentData;
import com.fusionincr.elasticsearch.exception.DeplicateApartmentException;
import com.fusionincr.elasticsearch.models.Apartment;
import com.fusionincr.elasticsearch.service.ApartmentService;

/**
 * @author sachin
 *
 */
@Component
public class FINCRApartmentFacade implements ApartmentFacade {

	@Autowired
	ApartmentService apartmentService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public ApartmentData addApartment(ApartmentData data) throws DeplicateApartmentException {
		List<Apartment> apartmentList  = apartmentService.findByApartmentName(data.getApartmentName());
		if(apartmentList.isEmpty())
		{
			Apartment apartment = modelMapper.map(data,Apartment.class);
			apartmentService.saveApartment(apartment);
			return data;
		}
		throw new DeplicateApartmentException("Apartment already present.");
	}

	@Override
	public ApartmentData updateApartment(ApartmentData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteApartment(ApartmentData data) {
		// TODO Auto-generated method stub

	}

}
