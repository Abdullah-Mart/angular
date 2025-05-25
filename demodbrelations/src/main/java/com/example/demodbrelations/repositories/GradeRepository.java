package com.example.demodbrelations.repositories;

import com.example.demodbrelations.entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {
}
