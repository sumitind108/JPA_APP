package com.JPAProject.projectjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.JPAProject.projectjpaandhibernate.course.Course;
import com.JPAProject.projectjpaandhibernate.course.springdatajpa.CourseSpringDataRepository;

@Component
public class courseCommandlineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1,"java devCourse", "SUMIT"));
		repository.save(new Course(2,"JDBC", "YADAV"));
		repository.save(new Course(3,"hibernate", "SUTARIYA"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("sumityadav"));


		
	}
	

}
