package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "property") // main property table
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
