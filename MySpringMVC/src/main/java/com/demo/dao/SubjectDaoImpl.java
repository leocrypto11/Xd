package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Subject;

@Repository
public class SubjectDaoImpl implements SubjectDao {

	@Autowired
	JdbcTemplate jdbctemp;

	@Override
	public List<Subject> getAllProducts() {
		List<Subject> lt = jdbctemp.query("select * from subjects", (rs, numrows) -> {
			Subject s = new Subject();
			s.setSid(rs.getInt(1));
			s.setSubname(rs.getString(2));
			s.setDuration(rs.getString(3));
			s.setStartdate(rs.getDate(4).toLocalDate());

			return s;
		});
		return lt;
	}

	@Override
	public boolean save(Subject s) {
		int n = jdbctemp.update("insert into subjects values(?,?,?,?)",
				new Object[] { s.getSid(), s.getSubname(), s.getDuration(), java.sql.Date.valueOf(s.getStartdate()) });
		return n > 0;
	}

	@Override
	public boolean removeById(int sid) {
		int n = jdbctemp.update("delete from subjects where sid=?", new Object [] {sid});
		return n > 0;
	}

	@Override
	public Subject findById(int sid) {
		try {
			Subject s = jdbctemp.queryForObject("select * from subjects where sid=?",
					new Object[] {sid}, BeanPropertyRowMapper.newInstance(Subject.class));
			return s;
		} catch (EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public boolean modifyProduct(Subject s) {
		int n = jdbctemp.update("update subjects set subname=?,duration=?,startdate=? where sid=?", 
				new Object[] { s.getSubname(), s.getDuration(), s.getStartdate(), s.getSid(),});
		return n>0;
	}

}
