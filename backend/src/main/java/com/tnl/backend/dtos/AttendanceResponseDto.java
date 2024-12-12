package com.tnl.backend.dtos;


import java.sql.Timestamp;

import com.tnl.backend.entities.Event;
import com.tnl.backend.entities.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AttendanceResponseDto {
    private Long id;
    private Boolean status;
    private Timestamp recorded;

    private User user;

    private Event event;

}
