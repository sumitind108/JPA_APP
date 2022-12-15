package com.JPAProject.projectjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPAProject.projectjpaandhibernate.course.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByAuthor(String author);

}
