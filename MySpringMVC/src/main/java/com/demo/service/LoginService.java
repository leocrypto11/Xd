package com.demo.service;

import com.demo.beans.Student;

public interface LoginService {

	Student validateUser(String sname, String pass);

}
