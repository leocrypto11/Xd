package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Student;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDao ldao;
	@Override
	public Student validateUser(String sname, String pass) {
		// TODO Auto-generated method stub
		return ldao.checkUser(sname,pass);
	}

}
