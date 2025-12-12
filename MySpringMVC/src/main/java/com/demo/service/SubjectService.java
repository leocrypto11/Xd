package com.demo.service;

import java.util.List;

import com.demo.beans.Subject;

public interface SubjectService {

	List<Subject> getAllProducts();

	boolean addsubject(Subject s);

	boolean deleteById(int sid);

	Subject getById(int sid);

	boolean updateproduct(Subject s);

}
