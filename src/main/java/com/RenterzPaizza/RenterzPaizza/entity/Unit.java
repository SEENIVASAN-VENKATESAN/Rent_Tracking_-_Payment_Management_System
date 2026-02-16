package com.RenterzPaizza.RenterzPaizza.entity;

import com.RenterzPaizza.RenterzPaizza.entity.enums.UnitStatus;
import com.RenterzPaizza.RenterzPaizza.entity.enums.UnitType;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "unit")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long unitId;            // primary key

    private String unitNumber;      // flat / room number

    @Enumerated(EnumType.STRING)
    private UnitType unitType;      // FLAT / ROOM / BED

    private Integer floor;          // floor number

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;      // belongs to property

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private UnitStatus status = UnitStatus.AVAILABLE;  // AVAILABLE / OCCUPIED / INACTIVE

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    private LocalDateTime createdAt;// unit created time
}