package com.nguyenhuutruong.identity_service.service;

import com.nguyenhuutruong.identity_service.dto.request.UserCreationRequest;
import com.nguyenhuutruong.identity_service.dto.request.UserUpdateRequest;
import com.nguyenhuutruong.identity_service.dto.respone.UserResponse;
import com.nguyenhuutruong.identity_service.entity.User;
import com.nguyenhuutruong.identity_service.enums.ErrorCode;
import com.nguyenhuutruong.identity_service.exception.AppException;
import com.nguyenhuutruong.identity_service.mapper.UserMapper;
import com.nguyenhuutruong.identity_service.repository.UserRepository;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {
    UserRepository userRepository;
    UserMapper userMapper;

    public UserResponse createUser(UserCreationRequest request) {
        if (userRepository.existsByUsername(request.getUsername()))
            throw new AppException(ErrorCode.USER_EXISTED);
        User user = userMapper.toUser(request);
        return userMapper.toUserResponse(userRepository.save(user));
    }

    public List<UserResponse> getUsers() {
        List<UserResponse> userResponseList = userMapper.toListUserResponse(userRepository.findAll());
        return userResponseList;
    }

    public UserResponse getUser(String id) {
        return userMapper.toUserResponse(userRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED)));
    }

    public UserResponse updateUser(String id, UserUpdateRequest request) {
        User user = userRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        userMapper.updateUser(user, request);
        return userMapper.toUserResponse(userRepository.save(user));
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
