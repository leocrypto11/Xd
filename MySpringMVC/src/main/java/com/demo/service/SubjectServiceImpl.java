package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.beans.Subject;
import com.demo.dao.SubjectDao;
@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	SubjectDao sdao;
	
	@Override
	public List<Subject> getAllProducts() {
		return sdao.getAllProducts(); 
	}

	@Override
	public boolean addsubject(Subject s) {
		// TODO Auto-generated method stub
		return sdao.save(s);
	}

	@Override
	public boolean deleteById(int sid) {
		// TODO Auto-generated method stub
		return sdao.removeById(sid);
	}

	@Override
	public Subject getById(int sid) {
		// TODO Auto-generated method stub
		return sdao.findById(sid);
	}

	@Override
	public boolean updateproduct(Subject s) {
		// TODO Auto-generated method stub
		return sdao.modifyProduct(s);
	}

}
