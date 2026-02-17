package com.RenterzPaizza.RenterzPaizza.entity;

import com.RenterzPaizza.RenterzPaizza.entity.enums.BillingStatus;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "rent")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentId;             // primary key

    @ManyToOne
    @JoinColumn(name = "allocation_id")

    private UnitAllocation allocation; // tenant allocation

    private Double amount;           // monthly rent amount

    private LocalDate dueDate;       // rent due date

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private BillingStatus status = BillingStatus.PENDING;   // DUE / PAID / OVERDUE

    private LocalDateTime createdAt; // rent generated time
    private String billingMonth; // format: 2026-02

}
