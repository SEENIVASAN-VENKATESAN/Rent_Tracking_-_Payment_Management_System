package com.RenterzPaizza.RenterzPaizza.mapper;

import com.RenterzPaizza.RenterzPaizza.dto.UnitResponse;
import com.RenterzPaizza.RenterzPaizza.entity.Unit;
import org.springframework.stereotype.Component;

@Component
public class UnitMapper {

    public UnitResponse toResponse(Unit unit) {

        return UnitResponse.builder()
                .unitId(unit.getUnitId())
                .unitNumber(unit.getUnitNumber())
                .unitType(unit.getUnitType())
                .floor(unit.getFloor())
                .status(unit.getStatus())
                .propertyId(unit.getProperty().getPropertyId())
                .build();
    }
}
