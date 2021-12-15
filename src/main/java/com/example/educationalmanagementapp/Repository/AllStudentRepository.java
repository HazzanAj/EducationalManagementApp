package com.example.educationalmanagementapp.Repository;

import com.example.educationalmanagementapp.Model.AllStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AllStudentRepository extends JpaRepository<AllStudent, Long> {
    void deleteAllStudentById(Long id);

    Optional<AllStudent> findAllStudentById(Long id);


}
