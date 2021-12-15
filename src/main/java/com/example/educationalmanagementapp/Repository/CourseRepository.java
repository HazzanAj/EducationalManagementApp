package com.example.educationalmanagementapp.Repository;

import com.example.educationalmanagementapp.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    void deleteById(Long id);

    @Override
    Optional<Course> findById(Long aLong);
}
