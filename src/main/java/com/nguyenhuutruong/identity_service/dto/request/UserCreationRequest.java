package com.nguyenhuutruong.identity_service.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;


public class UserCreationRequest {
    @NotBlank(message = "INVALID_BLANK_USERNAM")
    @Size(min = 3, message = "INVALID_SIZE_USERNAME")
    private String username;
    @NotBlank(message = "INVALID_BLANK_PASSWORD")
    @Size(min = 8, message = "INVALID_SIZE_PASSWORD")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
