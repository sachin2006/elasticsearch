package com.fusionincr.elasticsearch.repository;

import com.fusionincr.elasticsearch.models.Apartment;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ApartmentRepository extends ElasticsearchRepository<Apartment,String> {
    List<Apartment> findByApartmentName(String name);
}
