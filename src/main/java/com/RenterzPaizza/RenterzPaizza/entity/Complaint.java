package com.RenterzPaizza.RenterzPaizza.entity;


import com.RenterzPaizza.RenterzPaizza.entity.enums.DamageStatus;
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Id;


import java.time.LocalDateTime;

@Entity
@Table(name = "complaint")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complaintId;        // primary key

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;               // who raised complaint

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;               // related unit

    private String description; // complaint details
    private String title ;      //short complaint title

    @Enumerated(EnumType.STRING)
    private DamageStatus status;           // OPEN / IN_PROGRESS / CLOSED

    private LocalDateTime createdAt;// complaint created time
}