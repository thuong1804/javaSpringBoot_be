package com.example.be_taskmaster.modules.apiResponse;

import lombok.Data;

@Data
public class ApiResponse <T> {
    private int statusCode;
    private String message;
    private T result;
}
