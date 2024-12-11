package com.tnl.backend.services.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.tnl.backend.dtos.UserResponseDto;
import com.tnl.backend.mappers.UserMapper;
import com.tnl.backend.repositories.UserRepository;
import com.tnl.backend.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;
    
    @Override
    public Set<UserResponseDto> getUsers() {
        return userMapper.entitiesToDto(userRepository.findAll());
    }
    
}
