package com.RenterzPaizza.RenterzPaizza.entity;

import com.RenterzPaizza.RenterzPaizza.entity.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


@Entity
@Table(name = "users")   // stores all system users
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class    User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment primary key
        private Long userId;

        private String name; // user full name

        @Column(unique = true)
        private String email; // login + email notification

        @Column(unique = true)
        private String mobile; // SMS / WhatsApp / voice call

        private String password; // encrypted password

        @Enumerated(EnumType.STRING)
        private Role role; // ADMIN, OWNER, TENANT

    }
