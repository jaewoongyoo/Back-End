package com.example.jwt.controller;

import com.example.jwt.dto.UserDto;
import com.example.jwt.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDto userDto) {
        String token = authService.register(userDto);
        return ResponseEntity.ok("회원가입 성공. JWT Token: " + token);
    }
}