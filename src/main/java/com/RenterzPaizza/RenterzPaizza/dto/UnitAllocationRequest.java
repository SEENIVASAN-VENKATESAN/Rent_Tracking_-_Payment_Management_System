package com.RenterzPaizza.RenterzPaizza.dto;

import java.time.LocalDate;

public class UnitAllocationRequest {
    private Long unitId;
    private Long userId;
    private String occupancyType;
    private LocalDate startDate;
    private LocalDate endDate;
}
