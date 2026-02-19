package com.RenterzPaizza.RenterzPaizza.controller;
import com.RenterzPaizza.RenterzPaizza.dto.UserResponse;
import com.RenterzPaizza.RenterzPaizza.entity.User;
import com.RenterzPaizza.RenterzPaizza.mapper.UserMapper;
import com.RenterzPaizza.RenterzPaizza.security.SecurityUtil;
import com.RenterzPaizza.RenterzPaizza.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

     @GetMapping("/tenant/profile")
    public String profile() {

        String email = SecurityUtil.getCurrentUserEmail();

        return "Logged user = " + email;
    }


}
