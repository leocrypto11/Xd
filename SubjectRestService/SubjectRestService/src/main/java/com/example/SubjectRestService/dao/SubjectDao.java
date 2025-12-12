package com.example.SubjectRestService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SubjectRestService.beans.Subject;

@Repository
public interface SubjectDao  extends JpaRepository<Subject, Integer>{

}
