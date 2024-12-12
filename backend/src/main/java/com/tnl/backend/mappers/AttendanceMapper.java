package com.tnl.backend.mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel="spring", uses={UserMapper.class})
public class AttendanceMapper {
    
}
