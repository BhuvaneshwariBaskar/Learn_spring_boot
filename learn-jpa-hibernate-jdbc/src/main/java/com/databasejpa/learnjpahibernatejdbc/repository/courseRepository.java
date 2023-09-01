package com.databasejpa.learnjpahibernatejdbc.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.databasejpa.learnjpahibernatejdbc.model.Course;

@Repository
public class courseRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT_QUERY=""" 
			INSERT INTO COURSE (id,name,author) VALUES (?,?,?)
			""";
	private static String DELETE_QUERY=""" 
			Delete from course where id=?
			""";
	
	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	}
	public void delete(long id) {
		jdbcTemplate.update(DELETE_QUERY,id);
	}
}
