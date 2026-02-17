package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.dto.RegisterRequest;
import com.RenterzPaizza.RenterzPaizza.dto.UserResponse;
import com.RenterzPaizza.RenterzPaizza.entity.User;
import com.RenterzPaizza.RenterzPaizza.mapper.UserMapper;
import com.RenterzPaizza.RenterzPaizza.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserResponse register(RegisterRequest request) {

        User user =
                userMapper.toEntity(request, passwordEncoder);

        User saved = userRepository.save(user);

        return userMapper.toResponse(saved);
    }

}
