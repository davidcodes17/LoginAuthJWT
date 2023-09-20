package com.example.LoginAuthwithJWT.controllers;

import com.example.LoginAuthwithJWT.dtos.SignUpRequest;
import com.example.LoginAuthwithJWT.dtos.UserDTO;
import com.example.LoginAuthwithJWT.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpUserController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody SignUpRequest signUpRequest){
        UserDTO createUser = authService.createUser(signUpRequest);
        if (createUser==null){
            return new ResponseEntity<>("User is not Created, Try again Later", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createUser, HttpStatus.CREATED);
    }
}
