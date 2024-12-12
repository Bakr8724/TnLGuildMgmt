package com.tnl.backend.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class gearBuild {
    @Id
    @GeneratedValue
    private Long id;

    private byte[] gear_img_url;

    private byte[] skill_img_url;

    private String gear_url;

    private String build_name;

    private Timestamp created_at;

    // One-to-One: GearBuild <-> User
    @OneToOne
    private User user;
}
