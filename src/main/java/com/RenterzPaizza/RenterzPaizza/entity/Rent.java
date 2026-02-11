package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "rent")
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentId;             // primary key

    @ManyToOne
    @JoinColumn(name = "allocation_id")
    private UnitAllocation allocation; // tenant allocation

    private Double amount;           // monthly rent amount

    private LocalDate dueDate;       // rent due date

    private String status;           // DUE / PAID / OVERDUE

    private LocalDateTime createdAt; // rent generated time
}
