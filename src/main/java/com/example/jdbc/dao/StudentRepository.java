package com.example.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jdbc.beans.Student;

@Repository
public class StudentRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Student findById(long id) {
		return jdbcTemplate.queryForObject("select * from student where id=?",
				new Object[] { id }, new StudentMapper());
	}
}
