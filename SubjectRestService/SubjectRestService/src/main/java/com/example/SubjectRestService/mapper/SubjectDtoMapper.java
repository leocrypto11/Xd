package com.example.SubjectRestService.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.example.SubjectRestService.beans.Subject;
import com.example.SubjectRestService.dto.SubjectDto;

public class SubjectDtoMapper {

	public static Subject mapToSubject(SubjectDto d) {
		return new Subject(d.getSid(),d.getSubname(),d.getDuration(),LocalDate.parse(d.getStartdate(),DateTimeFormatter.ofPattern("dd-MM-yyyy")),d.getMarks());
	}
	public static SubjectDto mapToSubjectDto(Subject s) {
		if(s.getStartdate()==null) {
			return new SubjectDto(s.getSid(),s.getSubname(),s.getDuration(),null,s.getMarks());

		}else {
			return new SubjectDto(s.getSid(),s.getSubname(),s.getDuration(),s.getStartdate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),s.getMarks());

		}
		
	}
}
