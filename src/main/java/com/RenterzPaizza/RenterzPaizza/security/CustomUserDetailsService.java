package com.RenterzPaizza.RenterzPaizza.security;

import com.RenterzPaizza.RenterzPaizza.entity.User;
import com.RenterzPaizza.RenterzPaizza.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        // 1️⃣ Fetch user from DB using email
        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found"));

        // 2️⃣ Convert your User entity into Spring Security User
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getEmail())          // username (email)
                .password(user.getPassword())           // encrypted password
                .roles(user.getRole().name())           // ROLE name as STRING
                .build();
    }
}
