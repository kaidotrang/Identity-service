package com.nguyenhuutruong.identity_service.enums;

public enum ErrorCode {
    INVALID_KEY(5001, "Invalid Key"),
    USER_EXISTED(1001, "User Existed"),
    USER_NOT_EXISTED(1002, "User Not Existed"),
    INVALID_SIZE_USERNAME(1003, "Username has been at least 3 characters"),
    INVALID_BLANK_USERNAME(1004, "Username must not be blank"),
    INVALID_SIZE_PASSWORD(1005, "Password has been at least 8 characters"),
    INVALID_BLANK_PASSWORD(1006, "Password must not be blank"),
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
