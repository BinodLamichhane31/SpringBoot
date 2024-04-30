package com.example.demo.service;

import com.example.demo.futsalEntity.Ground;
import com.example.demo.pojo.GroundPojo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GroundService {
    void saveData(GroundPojo groundPojo);

    List<Ground> getAll();
    boolean deleteById(Integer id);
    Optional<Ground> findById(Integer id);

}
