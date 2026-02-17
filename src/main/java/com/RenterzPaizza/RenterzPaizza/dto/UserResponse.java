package com.RenterzPaizza.RenterzPaizza.dto;

import com.RenterzPaizza.RenterzPaizza.entity.enums.Role;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private Long userId;
    private String name;
    private String email;
    private String mobile;
    private Role role;
}

