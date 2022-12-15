package com.JPAProject.projectjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.JPAProject.projectjpaandhibernate.course.Course;

@Repository
public class courseJdbcRespository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY =
			
			"""
					insert  into course (id, name, author)
					values(1, 'java jpa and hibernate', 'sumityadav');

					
			""";
	
	public static String DELETE_QUERY = 
			
			"""
			delete form course where id?
			values(1, 'java jpa and hibernate', 'sumityadav');

			
			""";
	
	
	public void insert(Course course) {
		
		springJdbcTemplate.update(INSERT_QUERY);
		
	}
	
	public void delete(long id) {
		springJdbcTemplate.update(INSERT_QUERY, id);
	}

}
