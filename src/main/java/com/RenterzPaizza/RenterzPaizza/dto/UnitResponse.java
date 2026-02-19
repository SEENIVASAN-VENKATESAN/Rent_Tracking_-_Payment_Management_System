package com.RenterzPaizza.RenterzPaizza.dto;

import com.RenterzPaizza.RenterzPaizza.entity.enums.UnitStatus;
import com.RenterzPaizza.RenterzPaizza.entity.enums.UnitType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UnitResponse {
    private Long unitId;
    private String unitNumber;
    private UnitType unitType;
    private Integer floor;
    private UnitStatus status;
    private Long propertyId;
}

