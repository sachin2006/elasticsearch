package com.fusionincr.elasticsearch.service.impl;

import com.fusionincr.elasticsearch.models.Apartment;
import com.fusionincr.elasticsearch.repository.ApartmentRepository;
import com.fusionincr.elasticsearch.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ApartmentServiceImpl implements ApartmentService {

    @Autowired
    ApartmentRepository apartmentRepository;

    @Override
    public Apartment saveApartment(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    @Override
    public void deleteApartment(Apartment apartment) {

    }

    @Override
    public List<Apartment> findAll() {
        return StreamSupport.stream(apartmentRepository.findAll().spliterator(),false)
                            .collect(Collectors.toList());
    }

    @Override
    public List<Apartment> findByApartmentName(String name) {
        return StreamSupport.stream(apartmentRepository.findByApartmentName(name).spliterator(),false)
                .collect(Collectors.toList());
    }
}
