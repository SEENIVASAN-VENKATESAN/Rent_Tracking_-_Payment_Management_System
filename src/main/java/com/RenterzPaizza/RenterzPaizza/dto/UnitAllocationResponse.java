package com.RenterzPaizza.RenterzPaizza.dto;

import com.RenterzPaizza.RenterzPaizza.entity.enums.EntityStatus;

public class UnitAllocationResponse {
    private Long allocationId;
    private Long unitId;
    private Long userId;
    private String occupancyType;
    private EntityStatus status;
}
