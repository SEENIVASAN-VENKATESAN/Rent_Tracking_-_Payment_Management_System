package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Table(name = "communication")
public class Communication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long communicationId;   // primary key

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;              // user to whom message is sent

    private String channel;         // SMS / EMAIL / VOICE / WHATSAPP

    private String templateName;    // RENT_DUE / PAYMENT_SUCCESS

    private String message;         // final message content

    private String status;          // SENT / FAILED

    private LocalDateTime createdAt;// when communication was created/sent
}
