package com.databasejpa.learnjpahibernatejdbc.repository;

import org.springframework.stereotype.Repository;

import com.databasejpa.learnjpahibernatejdbc.model.Course;

import jakarta.persistence.EntityManager;

@Repository
public class coursejpa {
	private EntityManager entityManager;
	
	public void insert(Course course) {
		
	}
}
