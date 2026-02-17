package com.RenterzPaizza.RenterzPaizza.mapper;

import com.RenterzPaizza.RenterzPaizza.dto.PropertyRequest;
import com.RenterzPaizza.RenterzPaizza.dto.PropertyResponse;
import com.RenterzPaizza.RenterzPaizza.entity.Property;
import org.springframework.stereotype.Component;

@Component
public class PropertyMapper {

    public Property toEntity(PropertyRequest dto) {

        return Property.builder()
                .propertyName(dto.getPropertyName())
                .propertyType(dto.getPropertyType())
                .address(dto.getAddress())
                .city(dto.getCity())
                .build();
    }

    public PropertyResponse toResponse(Property entity) {

        return PropertyResponse.builder()
                .propertyId(entity.getPropertyId())
                .propertyName(entity.getPropertyName())
                .propertyType(String.valueOf(entity.getPropertyType()))
                .address(entity.getAddress())
                .city(entity.getCity())
                .build();
    }
}
