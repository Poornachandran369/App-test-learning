package com.poorna.student.Management.service;

import com.poorna.student.Management.model.User;
import com.poorna.student.Management.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User register(User user){
        return userRepository.save(user);
    }
}
