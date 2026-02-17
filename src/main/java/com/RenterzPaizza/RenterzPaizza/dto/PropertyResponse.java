package com.RenterzPaizza.RenterzPaizza.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyResponse {

    private Long propertyId;
    private String propertyName;
    private String propertyType;
    private String address;
    private String city;
}
