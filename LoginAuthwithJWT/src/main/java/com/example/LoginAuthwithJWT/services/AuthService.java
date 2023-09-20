package com.example.LoginAuthwithJWT.services;

import com.example.LoginAuthwithJWT.dtos.SignUpRequest;
import com.example.LoginAuthwithJWT.dtos.UserDTO;

public interface AuthService {
    UserDTO createUser(SignUpRequest signUpRequest);
}
