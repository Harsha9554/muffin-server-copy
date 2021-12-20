package com.haven.muffinserver.service;

import com.haven.muffinserver.model.User;
import com.haven.muffinserver.web.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
