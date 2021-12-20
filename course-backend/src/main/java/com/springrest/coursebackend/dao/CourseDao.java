package com.springrest.coursebackend.dao;

import com.springrest.coursebackend.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {

}
