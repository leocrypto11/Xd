package com.demo.dao;

import com.demo.beans.Student;

public interface LoginDao {

	Student checkUser(String sname, String pass);

}
