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
public class Announcements {
    @Id
    @GeneratedValue
    private Long id;

    private Timestamp date;

    private String title;

    private String message;

    private String category;

    @ManyToOne
    private User author;
}
