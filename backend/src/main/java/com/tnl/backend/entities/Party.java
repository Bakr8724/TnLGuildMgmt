package com.tnl.backend.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Party {
    @Id
    @GeneratedValue
    private Long id;

    private String title;


    @ManyToMany
    private Set<User> users = new HashSet<>();


    @OneToOne
    private Class associatedClass;


    @OneToOne
    private User partyLeader;
}
