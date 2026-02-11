package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.entity.Property;
import com.RenterzPaizza.RenterzPaizza.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public Property create(Property property) {
        return propertyRepository.save(property);
    }

    public List<Property> getByAdmin(Long userId) {
        return propertyRepository.findByAdminUserId(userId);
    }
}
