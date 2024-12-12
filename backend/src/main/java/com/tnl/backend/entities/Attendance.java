package com.tnl.backend.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Attendance {
    @Id
    @GeneratedValue
    private Long id;

    private Boolean status;

    private Timestamp recorded;

    // Many-to-One: Attendance -> User
    @ManyToOne
    private User user;

    // Many-to-One: Attendance -> Event
    @ManyToOne
    private Event event;
}
