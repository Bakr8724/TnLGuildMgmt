package com.tnl.backend.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserRequestDto {
    private String ingame_userName;

    private int gearScore;
}