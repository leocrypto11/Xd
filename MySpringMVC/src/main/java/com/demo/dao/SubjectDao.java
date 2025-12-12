package com.demo.dao;

import java.util.List;

import com.demo.beans.Subject;

public interface SubjectDao {

	List<Subject> getAllProducts();

	boolean save(Subject s);

	boolean removeById(int sid);

	Subject findById(int sid);

	boolean modifyProduct(Subject s);

}
