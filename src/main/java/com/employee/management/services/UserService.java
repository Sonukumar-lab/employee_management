package com.employee.management.services;

import com.employee.management.models.User;
import com.employee.management.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    public User getUserByUsername(String username) { return userRepository.findById(username).orElse(null); }
}