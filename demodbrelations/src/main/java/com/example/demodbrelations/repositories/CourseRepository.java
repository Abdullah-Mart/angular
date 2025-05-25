package com.example.demodbrelations.repositories;

import com.example.demodbrelations.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
