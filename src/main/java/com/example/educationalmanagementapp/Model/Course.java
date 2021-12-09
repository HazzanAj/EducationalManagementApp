package com.example.educationalmanagementapp.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String coursePlace;
    private String courseName;
    private String courseLectureTime;
    private String courseDuration;
    private String courseInstructor;
    private String courseFee;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="instructor_id", referencedColumnName = "id")
    private User instructors;
    @ManyToMany(mappedBy = "course")
    private List<Instructor> instructor;
    @ManyToMany(mappedBy = "course")
    private List<RegisteredStudent> registeredStudent;
    @ManyToMany(mappedBy = "course")
    private List<UnRegisteredStudent> unRegisteredStudent;
}

