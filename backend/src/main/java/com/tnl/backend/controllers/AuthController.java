package com.tnl.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnl.backend.config.DiscordConfig;
import com.tnl.backend.dtos.AuthRequestDto;
import com.tnl.backend.dtos.UserResponseDto;
import com.tnl.backend.entities.User;
import com.tnl.backend.mappers.UserMapper;
import com.tnl.backend.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private DiscordConfig discordConfig;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login")
    public UserResponseDto login(@RequestBody AuthRequestDto authRequestDto){
        User user = authService.processDiscordLogin(authRequestDto.getCode());
        return UserService.entitiesToDto(user);
    }
}
