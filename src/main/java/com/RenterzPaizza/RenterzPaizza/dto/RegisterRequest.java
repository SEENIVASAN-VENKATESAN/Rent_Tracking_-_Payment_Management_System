package com.RenterzPaizza.RenterzPaizza.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String mobile;
    private String password;
    private String role;
}
