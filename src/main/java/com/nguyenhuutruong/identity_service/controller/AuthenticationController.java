package com.nguyenhuutruong.identity_service.controller;

import com.nguyenhuutruong.identity_service.dto.request.ApiResponse;
import com.nguyenhuutruong.identity_service.dto.request.AuthenticationRequest;
import com.nguyenhuutruong.identity_service.dto.respone.AuthenticationRespone;
import com.nguyenhuutruong.identity_service.service.AuthenticationService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationController {
    AuthenticationService service;

    @PostMapping("/log-in")
    ApiResponse<AuthenticationRespone> authenticate(@RequestBody AuthenticationRequest request) {
        boolean result = service.authenticate(request);
        return ApiResponse.<AuthenticationRespone>builder()
                .result(AuthenticationRespone.builder()
                        .authenticated(result)
                        .build())
                .build();
    }
}
