package com.RenterzPaizza.RenterzPaizza.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterRequest {
    private String fullName;
    private String email;
    private String password;
    private String role;
}
