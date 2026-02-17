package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.dto.PropertyRequest;
import com.RenterzPaizza.RenterzPaizza.dto.PropertyResponse;
import com.RenterzPaizza.RenterzPaizza.entity.Property;
import com.RenterzPaizza.RenterzPaizza.mapper.PropertyMapper;
import com.RenterzPaizza.RenterzPaizza.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyMapper propertyMapper;

    public PropertyResponse create(PropertyRequest request) {

        Property property = propertyMapper.toEntity(request);

        Property saved = propertyRepository.save(property);

        return propertyMapper.toResponse(saved);
    }
    public PropertyResponse getById(Long id){

        Property property = propertyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Property not found"));

        return propertyMapper.toResponse(property);
    }

}
