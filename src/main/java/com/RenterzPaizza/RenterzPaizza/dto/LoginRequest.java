package com.RenterzPaizza.RenterzPaizza.dto;

import lombok.Data;

@Data
public class LoginRequest {

    private String email;     // email entered by user
    private String password;  // plain password from request
}