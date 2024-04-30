package com.example.demo.service;

import com.example.demo.futsalEntity.User;
import com.example.demo.pojo.UserPojo;

public interface UserService {
    void getUserById(Integer id);

    void createUser(UserPojo userPojo);
}
