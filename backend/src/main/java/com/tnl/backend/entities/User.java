package com.tnl.backend.entities;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_table")
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String discord_userName;

    private String ingame_userName;

    private int gearScore;

    private String role;

    private String activityStanding;

    // Many-to-One: User -> Class
    @ManyToOne
    private Class class_id;

    // One-to-One: User -> GearBuild
    @OneToOne(mappedBy = "user")
    @EqualsAndHashCode.Exclude
    private gearBuild gearBuild;

    // Other relationships (already discussed)
    @OneToMany(mappedBy = "author")
    @EqualsAndHashCode.Exclude
    private Set<Announcements> announcements = new HashSet<>();

    @ManyToMany(mappedBy = "users")
    @EqualsAndHashCode.Exclude
    private Set<Party> parties = new HashSet<>();

    @OneToMany(mappedBy = "user")
    @EqualsAndHashCode.Exclude
    private Set<Attendance> attendance = new HashSet<>();

  


}
