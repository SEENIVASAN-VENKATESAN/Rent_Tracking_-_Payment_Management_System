package com.RenterzPaizza.RenterzPaizza.entity;

import com.RenterzPaizza.RenterzPaizza.entity.enums.EntityStatus;
import com.RenterzPaizza.RenterzPaizza.entity.enums.OccupancyType;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "unit_allocation")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class UnitAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long allocationId;      // primary key

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;              // allocated unit

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User tenant;              // owner / tenant

    @Enumerated(EnumType.STRING)
    private OccupancyType occupancyType; //(RENT / LEASE) // OWNER / TENANT / LEASE

    private LocalDate startDate;    // allocation start

    private LocalDate endDate;      // allocation end

    @Enumerated(EnumType.STRING)
    private EntityStatus status;    //ACTIVE,INACTIVE,TERMINATED

    private LocalDateTime createdAt;// allocation created time


}

