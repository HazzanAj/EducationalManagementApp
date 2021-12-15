package com.example.educationalmanagementapp.Repository;


import com.example.educationalmanagementapp.Model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    void deleteById(Long id);

    @Override
    Optional<Instructor> findById(Long aLong);
}
