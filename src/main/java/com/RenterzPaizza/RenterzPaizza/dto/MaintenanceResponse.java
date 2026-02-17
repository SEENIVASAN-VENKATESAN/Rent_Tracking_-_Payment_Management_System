package com.RenterzPaizza.RenterzPaizza.dto;

import com.RenterzPaizza.RenterzPaizza.entity.enums.BillingStatus;

import java.time.LocalDate;

public class MaintenanceResponse {
    private Long maintenanceId;
    private Long unitId;
    private Double amount;
    private LocalDate dueDate;
    private BillingStatus status;
}
