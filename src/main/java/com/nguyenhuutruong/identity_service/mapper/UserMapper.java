package com.nguyenhuutruong.identity_service.mapper;

import com.nguyenhuutruong.identity_service.dto.request.UserCreationRequest;
import com.nguyenhuutruong.identity_service.dto.request.UserUpdateRequest;
import com.nguyenhuutruong.identity_service.dto.respone.UserResponse;
import com.nguyenhuutruong.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface UserMapper {
    User toUser(UserCreationRequest request);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);

    UserResponse toUserResponse(User user);
    List<UserResponse> toListUserResponse(List<User> userList);

}
