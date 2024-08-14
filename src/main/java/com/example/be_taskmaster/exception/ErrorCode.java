package com.example.be_taskmaster.exception;

import lombok.Data;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Exception"),
    USER_EXISTED(1001, "User already existed"),
    PHONE_EXISTED(1001, "Phone already existed"),
    PASSWORD_LENGTH(1002, "Password must be at least 8 characters"),
    ;

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
