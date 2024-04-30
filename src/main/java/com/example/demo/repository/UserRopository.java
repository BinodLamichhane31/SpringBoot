package com.example.demo.repository;

import com.example.demo.futsalEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRopository extends JpaRepository<User, Long> {
}
