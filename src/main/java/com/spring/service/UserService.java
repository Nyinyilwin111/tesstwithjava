package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.User;
import com.spring.reposity.UserRepo;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public int insertUser(User user) {
        return userRepo.insertUser(user);
    }

    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }
}
