package com.tnl.backend.entities;

import java.sql.Timestamp;
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
public class Event {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Timestamp date;

    private String tag;

    private String description;

    // One-to-Many: Event <-> Attendance
    @OneToMany(mappedBy = "event")
    private Set<Attendance> attendees = new HashSet<>();
}
