package com.nguyenhuutruong.identity_service.exception;

import com.nguyenhuutruong.identity_service.enums.ErrorCode;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
public class AppException extends RuntimeException{
    private ErrorCode errorCode;

    public AppException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
