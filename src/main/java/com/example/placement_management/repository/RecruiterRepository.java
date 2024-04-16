package com.example.placement_management.repository;

import com.example.placement_management.entity.RecruiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterRepository extends JpaRepository<RecruiterEntity, Long> {
    RecruiterEntity findByUsername(String username);
}
