package com.databasejpa.learnjpahibernatejdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.databasejpa.learnjpahibernatejdbc.model.Course;

@Component
public class courseJdbcClr implements CommandLineRunner{
	@Autowired
	private courseRepository courseRepo ; 
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseRepo.insert(new Course(1,"hey2","Hello1"));
		courseRepo.insert(new Course(2,"hey22","Hello11"));
		courseRepo.delete(1);


		
	}

}
