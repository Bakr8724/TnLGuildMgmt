package com.tnl.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnl.backend.entities.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    
}
