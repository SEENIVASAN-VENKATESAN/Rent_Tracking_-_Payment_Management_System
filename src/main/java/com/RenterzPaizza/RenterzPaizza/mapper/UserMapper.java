package com.RenterzPaizza.RenterzPaizza.mapper;

import com.RenterzPaizza.RenterzPaizza.dto.RegisterRequest;
import com.RenterzPaizza.RenterzPaizza.dto.UserResponse;
import com.RenterzPaizza.RenterzPaizza.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    // DTO → Entity (for register)
    public User toEntity(RegisterRequest dto, PasswordEncoder encoder) {

        return User.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .mobile(dto.getMobile())
                .password(encoder.encode(dto.getPassword()))
                .role(dto.getRole())
                .build();
    }

    // Entity → Response DTO
    public UserResponse toResponse(User user) {

        return UserResponse.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .email(user.getEmail())
                .mobile(user.getMobile())
                .role(user.getRole())
                .build();
    }
}
