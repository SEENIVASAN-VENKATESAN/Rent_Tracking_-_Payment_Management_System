package com.RenterzPaizza.RenterzPaizza.dto;

import com.RenterzPaizza.RenterzPaizza.entity.enums.PropertyType;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
public class PropertyRequest {
    private String propertyName;
    private PropertyType propertyType;
    private String address;
    private String city;
}
