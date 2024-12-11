package com.tnl.backend.services;

import java.util.Set;

import com.tnl.backend.dtos.UserResponseDto;

public interface UserService {

    Set<UserResponseDto> getUsers();
    
}
