package com.example.demodbrelations.repositories;

import com.example.demodbrelations.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
