package com.nguyenhuutruong.identity_service.dto.respone;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String id;
    String username;
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
