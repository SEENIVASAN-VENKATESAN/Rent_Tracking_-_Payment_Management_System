package com.RenterzPaizza.RenterzPaizza.dto;

import com.RenterzPaizza.RenterzPaizza.entity.enums.BillingStatus;

import java.time.LocalDate;

public class RentResponse {
    private Long rentId;
    private Long allocationId;
    private Double amount;
    private LocalDate dueDate;
    private BillingStatus status;
}
