package com.RenterzPaizza.RenterzPaizza.entity;

import com.RenterzPaizza.RenterzPaizza.entity.enums.EntityStatus;
import com.RenterzPaizza.RenterzPaizza.entity.enums.PropertyType;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "property") // main property table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // property unique id
    private Long propertyId;

    private String propertyName; // apartment / pg name

    @Enumerated(EnumType.STRING)
    private PropertyType propertyType; // APARTMENT / PG / BUILDING

    private String address; // full address

    private String city; // city name

    @Enumerated(EnumType.STRING)
    private EntityStatus status;

    @ManyToOne
    @JoinColumn(name = "admin_id") // property managed by admin
    private User admin;

}
