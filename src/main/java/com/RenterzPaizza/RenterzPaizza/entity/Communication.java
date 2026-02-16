package com.RenterzPaizza.RenterzPaizza.entity;

import com.RenterzPaizza.RenterzPaizza.entity.enums.CommunicationChannel;
import com.RenterzPaizza.RenterzPaizza.entity.enums.CommunicationStatus;
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
@Entity
@Table(name = "communication")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Communication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long communicationId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private CommunicationChannel channel;

    private String templateName;

    private String message;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private CommunicationStatus status = CommunicationStatus.PENDING;

    private LocalDateTime createdAt;
}
