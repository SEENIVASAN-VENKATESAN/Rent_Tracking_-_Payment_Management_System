package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "maintenance")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
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

