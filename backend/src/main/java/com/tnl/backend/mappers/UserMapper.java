package com.tnl.backend.mappers;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;

import com.tnl.backend.dtos.UserResponseDto;
import com.tnl.backend.entities.User;

@Mapper(componentModel="spring", uses={})
public interface UserMapper {
    Set<UserResponseDto> entitiesToDto(List<User> user);
}
