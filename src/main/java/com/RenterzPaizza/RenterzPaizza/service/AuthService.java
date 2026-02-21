package com.RenterzPaizza.RenterzPaizza.service;

import com.RenterzPaizza.RenterzPaizza.dto.AuthResponse;
import com.RenterzPaizza.RenterzPaizza.dto.LoginRequest;
import com.RenterzPaizza.RenterzPaizza.dto.RegisterRequest;
import com.RenterzPaizza.RenterzPaizza.dto.UserResponse;
import com.RenterzPaizza.RenterzPaizza.entity.User;
import com.RenterzPaizza.RenterzPaizza.exception.BadRequestException;
import com.RenterzPaizza.RenterzPaizza.mapper.UserMapper;
import com.RenterzPaizza.RenterzPaizza.repository.UserRepository;
import com.RenterzPaizza.RenterzPaizza.security.JwtUtil;
import jakarta.transaction.Transactional;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    private final UserMapper userMapper;

    public AuthService(AuthenticationManager authenticationManager,
                       UserRepository userRepository,
                       PasswordEncoder passwordEncoder,
                       JwtUtil jwtUtil,
                       UserMapper userMapper) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
        this.userMapper = userMapper;
    }

    @Transactional
    public UserResponse registerTenant(RegisterRequest request) {
        if (userRepository.existsByEmailAndDeletedFalse(request.getEmail().toLowerCase())) {
            throw new BadRequestException("Email already registered");
        }
        if (userRepository.existsByMobileAndDeletedFalse(request.getMobile())) {
            throw new BadRequestException("Mobile already registered");
        }

        User user = userMapper.toTenantEntity(request, passwordEncoder);
        User saved = userRepository.save(user);
        return userMapper.toResponse(saved);
    }

    public AuthResponse login(LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail().toLowerCase(), request.getPassword())
        );

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = userRepository.findByEmailAndDeletedFalse(request.getEmail().toLowerCase())
                .orElseThrow(() -> new BadRequestException("Invalid credentials"));

        return AuthResponse.builder()
                .token(jwtUtil.generateToken(userDetails))
                .email(user.getEmail())
                .role(user.getRole().name())
                .build();
    }
}
