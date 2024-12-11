package com.tnl.backend.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserResponseDto {
    private Long id;

    private String discord_userName;

    private String ingame_userName;

    private int gearScore;

    private String role;

    private String activityStanding;

    
}
