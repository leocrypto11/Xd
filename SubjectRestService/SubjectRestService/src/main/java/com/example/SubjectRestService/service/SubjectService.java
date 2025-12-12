package com.example.SubjectRestService.service;

import java.util.List;

import com.example.SubjectRestService.beans.Subject;
import com.example.SubjectRestService.dto.SubjectDto;

public interface SubjectService {

	List<SubjectDto> findAllSubjects();

	SubjectDto searchById(int sid);

	Subject editSubject(SubjectDto ed);

	Subject addNew(SubjectDto ed);

	Subject deleteById(SubjectDto dd);

}
