package com.tnl.backend.entities;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Class {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private byte[] img;

    private String mainHand;

    private String offHand;

    @OneToMany(mappedBy= "class_id")
    private Set<User> users = new HashSet<>();

}
