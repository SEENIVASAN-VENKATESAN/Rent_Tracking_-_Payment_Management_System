package com.RenterzPaizza.RenterzPaizza.entity;

import com.RenterzPaizza.RenterzPaizza.entity.enums.BillingStatus;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "maintenance")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maintenanceId;      // primary key

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;               // maintenance for unit

    private Double amount;           // maintenance amount

    private LocalDate dueDate;       // due date

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private BillingStatus status = BillingStatus.PENDING;// DUE / PAID

    private LocalDateTime createdAt;// maintenance created time
}

