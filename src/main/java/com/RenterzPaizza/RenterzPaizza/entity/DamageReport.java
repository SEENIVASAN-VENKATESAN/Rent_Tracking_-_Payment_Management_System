package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "damage_report")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class DamageReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long damageId;           // primary key

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;               // damaged unit

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;               // responsible user

    private String beforeImage;      // before stay image

    private String afterImage;       // after leaving image

    private Double estimatedCost;    // damage cost

    private String status;           // OPEN / PAID

    private LocalDateTime createdAt;// report created time
}

