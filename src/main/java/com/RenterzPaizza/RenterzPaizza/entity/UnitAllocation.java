package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "unit_allocation")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UnitAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long allocationId;      // primary key

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;              // allocated unit

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;              // owner / tenant

    private String allocationType;  // OWNER / TENANT / LEASE

    private LocalDate startDate;    // allocation start

    private LocalDate endDate;      // allocation end

    private String status;          // ACTIVE / ENDED

    private LocalDateTime createdAt;// allocation created time


}

