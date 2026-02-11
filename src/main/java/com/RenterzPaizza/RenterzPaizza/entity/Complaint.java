package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Table(name = "complaint")
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complaintId;        // primary key

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;               // who raised complaint

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;               // related unit

    private String description; // complaint details
    private String title ;      //short complaint title

    private String status;           // OPEN / IN_PROGRESS / CLOSED

    private LocalDateTime createdAt;// complaint created time
}