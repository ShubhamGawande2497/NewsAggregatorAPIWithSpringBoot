package com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.controller;

import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.model.dto.UserDTO;
import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.entity.User;
import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.model.response.ApiResponse;
import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.model.response.LoginResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    private final AuthenticationService authService;

    public AuthenticationController(AuthenticationService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<User>> registerUser(@Valid @RequestBody UserDTO registerRequest) {
        User user = authService.registerUser(registerRequest);
        return ResponseEntity.ok(new ApiResponse<>(true, "User registered successfully"));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<LoginResponse>> loginUser(@Valid @RequestBody UserDTO loginRequest) {
        LoginResponse loginResponse = authService.loginUser(loginRequest);
        return ResponseEntity.ok(new ApiResponse<LoginResponse>(true, "User logged in successfully", loginResponse));
    }
}
