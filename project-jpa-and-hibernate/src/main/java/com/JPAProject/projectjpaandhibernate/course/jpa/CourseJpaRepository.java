package com.JPAProject.projectjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.JPAProject.projectjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityMangaer;

	public void insert(Course course) {
		entityMangaer.merge(course);
	}
	
	public Course findById(long id) {
		return entityMangaer.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		Course course = entityMangaer.find(Course.class, id);
		entityMangaer.remove(course);
	}

	
	
	

}
