package com.nguyenhuutruong.identity_service.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @NotBlank(message = "INVALID_BLANK_USERNAM")
    @Size(min = 3, message = "INVALID_SIZE_USERNAME")
    String username;
    @NotBlank(message = "INVALID_BLANK_PASSWORD")
    @Size(min = 8, message = "INVALID_SIZE_PASSWORD")
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
