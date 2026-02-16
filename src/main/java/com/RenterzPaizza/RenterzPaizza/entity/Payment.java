package com.RenterzPaizza.RenterzPaizza.entity;

import com.RenterzPaizza.RenterzPaizza.entity.enums.BillingStatus;
import com.RenterzPaizza.RenterzPaizza.entity.enums.PaymentMode;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "payment")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // who paid

    // 🔹 Rent payment
    @ManyToOne
    @JoinColumn(name = "rent_id", nullable = true)
    private Rent rent;

    // 🔹 Maintenance payment
    @ManyToOne
    @JoinColumn(name = "maintenance_id", nullable = true)
    private Maintenance maintenance;

    // 🔹 Damage payment (THIS IS WHAT YOU ASKED)
    @ManyToOne
    @JoinColumn(name = "damage_id", nullable = true)
    private DamageReport damageReport;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @Enumerated(EnumType.STRING)
    private BillingStatus status;

    private LocalDateTime paymentDate;
}
