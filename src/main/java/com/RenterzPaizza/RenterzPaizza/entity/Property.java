package com.RenterzPaizza.RenterzPaizza.entity;

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

    private String propertyType; // APARTMENT / PG / BUILDING

    private String address; // full address

    private String city; // city name

    @ManyToOne
    @JoinColumn(name = "admin_id") // property managed by admin
    private User admin;

}
