package com.example.demo.shared.pojo;

import lombok.*;

import java.util.List;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class GlobalApiResponse <T>{
    private String message;
    private Integer statusCode;
    private T data;
}
