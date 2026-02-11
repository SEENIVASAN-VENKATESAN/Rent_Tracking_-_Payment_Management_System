package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;                 // who paid

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;         // for which property

    private Double amount;             // paid amount

    private String paymentMode;        // UPI / CASH / CARD / NETBANKING

    private String paymentStatus;      // SUCCESS / FAILED / PENDING

    private LocalDateTime paymentDate; // when payment happened
}