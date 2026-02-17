package com.RenterzPaizza.RenterzPaizza.dto;

import com.RenterzPaizza.RenterzPaizza.entity.enums.UnitStatus;

public class UnitResponse {
    private Long unitId;
    private String unitNumber;
    private String unitType;
    private Integer floor;
    private UnitStatus status;
    private Long propertyId;
}

