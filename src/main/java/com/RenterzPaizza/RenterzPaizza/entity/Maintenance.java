package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maintenanceId;      // primary key

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;               // maintenance for unit

    private Double amount;           // maintenance amount

    private LocalDate dueDate;       // due date

    private String status;           // DUE / PAID

    private LocalDateTime createdAt;// maintenance created time
}

