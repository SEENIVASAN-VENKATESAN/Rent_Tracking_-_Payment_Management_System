package com.RenterzPaizza.RenterzPaizza.mapper;

import com.RenterzPaizza.RenterzPaizza.dto.UserResponse;
import com.RenterzPaizza.RenterzPaizza.entity.User;

public class UserMapper {

    // ENTITY → DTO
    public static UserResponse toResponse(User user) {

        if (user == null) return null;

        UserResponse dto = new UserResponse();

        dto.setUserId(user.getUserId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setMobile(user.getMobile());
        dto.setRole(user.getRole());

        return dto;
    }
}
