package com.RenterzPaizza.RenterzPaizza.dto;

import com.RenterzPaizza.RenterzPaizza.entity.enums.BillingStatus;

import java.time.LocalDateTime;

public class PaymentResponse {
    private Long paymentId;
    private Double amount;
    private BillingStatus status;
    private LocalDateTime paymentDate;
}
