/**
 * 
 */
package com.fusionincr.elasticsearch.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fusionincr.elasticsearch.FINCRResponseEntity;
import com.fusionincr.elasticsearch.data.ApartmentData;
import com.fusionincr.elasticsearch.dto.ApartmentDto;
import com.fusionincr.elasticsearch.exception.DeplicateApartmentException;
import com.fusionincr.elasticsearch.facade.ApartmentFacade;

/**
 * @author sachin
 *
 */
@RestController
@RequestMapping(value = "/es")
public class FINCRElasticSearch {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	ApartmentFacade apartmentFacade;

	@RequestMapping(value = "/addApartment", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<ApartmentDto> addApartmentDocument(@RequestBody ApartmentData apartment)
	{
		try {
			ApartmentData apartmentData  = apartmentFacade.addApartment(apartment);
			return FINCRResponseEntity.status(HttpStatus.OK).body(modelMapper.map(apartmentData, ApartmentDto.class));
			
		} catch (DeplicateApartmentException e) {
			e.printStackTrace();
			return FINCRResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
}
