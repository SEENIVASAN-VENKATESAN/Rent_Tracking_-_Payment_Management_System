package com.RenterzPaizza.RenterzPaizza.dto;

import com.RenterzPaizza.RenterzPaizza.entity.enums.WorkFlowStatus;

import java.time.LocalDateTime;

public class ComplaintResponse {
    private Long complaintId;
    private String title;
    private String description;
    private WorkFlowStatus status;
    private LocalDateTime createdAt;
}
