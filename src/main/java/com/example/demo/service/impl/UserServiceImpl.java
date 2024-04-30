package com.example.demo.service.impl;

import com.example.demo.futsalEntity.User;
import com.example.demo.pojo.UserPojo;
import com.example.demo.repository.UserRopository;
import com.example.demo.service.UserService;


public class UserServiceImpl implements UserService {

    private final UserRopository userRepository;

    public UserServiceImpl(UserRopository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void getUserById(Integer id) {
        
    }

    @Override
    public void createUser(UserPojo userPojo) {
        User user = new User();
        user.setUsername(userPojo.getUsername());
        userRepository.save(user);
    }

    public void getUserById(UserPojo id) {

    }

}
