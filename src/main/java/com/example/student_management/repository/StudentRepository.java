package com.example.student_management.repository;

import com.example.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Search by student name
    List<Student> findByNameContainingIgnoreCase(String name);

    // Filter by course
    List<Student> findByCourseIgnoreCase(String course);

    // Filter by active status
    List<Student> findByActive(boolean active);
}