package com.example.SubjectRestService.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SubjectRestService.beans.Subject;
import com.example.SubjectRestService.dao.SubjectDao;
import com.example.SubjectRestService.dto.SubjectDto;
import com.example.SubjectRestService.mapper.SubjectDtoMapper;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	public SubjectDao dao;

	@Override
	public List<SubjectDto> findAllSubjects() {
		List<Subject> slist = dao.findAll(); 
		if(slist != null) {
		List<SubjectDto> sdto = slist.stream()
				.map(s -> SubjectDtoMapper.mapToSubjectDto(s)).collect(Collectors.toList());
		return sdto;
		}
		return null;
	}

	@Override
	public SubjectDto searchById(int sid) {

		Optional<Subject> sfind = dao.findById(sid);
		Subject s = sfind.get();
		SubjectDto sdto = SubjectDtoMapper.mapToSubjectDto(s);
		
		return sdto;
	}

	@Override
	public Subject editSubject(SubjectDto ed) {
			Subject s = SubjectDtoMapper.mapToSubject(ed);
			dao.saveAndFlush(s);

		return s;
	}

	@Override
	public Subject addNew(SubjectDto ed) {
		Subject s = SubjectDtoMapper.mapToSubject(ed);
		dao.save(s);
		return s;
	}

	@Override
	public Subject deleteById(SubjectDto dd) {
		
		int id = dd.getSid();
		Subject s = SubjectDtoMapper.mapToSubject(dd);
		if(dao.existsById(id)) {
			dao.deleteById(id);
			return s;
		}
		
		
		return null;
	}
}
