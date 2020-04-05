package com.fusionincr.elasticsearch.service;

import com.fusionincr.elasticsearch.models.Apartment;

import java.util.List;

public interface ApartmentService {
    Apartment saveApartment(Apartment apartment);
    void deleteApartment(Apartment apartment);
    List<Apartment> findAll();
    List<Apartment> findByApartmentName(String name);
}
