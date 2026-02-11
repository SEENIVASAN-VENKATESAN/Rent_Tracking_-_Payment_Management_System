package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Entity
@Table(name = "unit")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long unitId;            // primary key

    private String unitNumber;      // flat / room number

    private String unitType;        // FLAT / ROOM / BED

    private Integer floor;          // floor number

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;      // belongs to property

    private String status;          // AVAILABLE / OCCUPIED / INACTIVE

    private LocalDateTime createdAt;// unit created time
}