package com.RenterzPaizza.RenterzPaizza.dto;

import java.time.LocalDateTime;

public class CommunicationResponse {
    private Long communicationId;
    private String channel;
    private String templateName;
    private String status;
    private LocalDateTime createdAt;
}
