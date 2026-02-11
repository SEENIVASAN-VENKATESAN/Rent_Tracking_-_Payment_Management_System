package com.RenterzPaizza.RenterzPaizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")   // stores all system users
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment primary key
        private Long userId;

        private String name; // user full name

        @Column(unique = true)
        private String email; // login + email notification

        @Column(unique = true)
        private String mobile; // SMS / WhatsApp / voice call

        private String password; // encrypted password

        private String role; // ADMIN, OWNER, TENANT

    }
