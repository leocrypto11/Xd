package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Student;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	JdbcTemplate jdbctemp;

	@Override
	public Student checkUser(String sname, String pass) {
		try {
			Student s = jdbctemp.queryForObject("select * from student1 where sname=? and password=?",
					new Object[] { sname, pass }, BeanPropertyRowMapper.newInstance(Student.class));
			System.out.println(s);
			return s;
		} catch (EmptyResultDataAccessException e) {
			System.out.println("User Not Found");
			return null;

		}

	}

}
