package com.example.SubjectRestService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SubjectRestService.beans.Subject;
import com.example.SubjectRestService.dto.SubjectDto;
import com.example.SubjectRestService.service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	public SubjectService service;

	@GetMapping("/subject")
	public ResponseEntity<List<SubjectDto>> displaySubjects() {
		List<SubjectDto> sub = service.findAllSubjects();

		if (sub != null) {
			return ResponseEntity.ok(sub);
		} else {
			return (ResponseEntity<List<SubjectDto>>) ResponseEntity.notFound();
		}

	}

	@GetMapping("/subject/{sid}")
	public ResponseEntity<SubjectDto> findById(@PathVariable int sid) {
		SubjectDto sub = service.searchById(sid);
		if (sub != null) {
			return ResponseEntity.ok(sub);
		} else {
			return (ResponseEntity<SubjectDto>) ResponseEntity.notFound();
		}

	}

	@PutMapping("/subject/{sid}")
	public ResponseEntity<String> editById(@RequestBody SubjectDto ed) {

		Subject s = service.editSubject(ed);
		if (s != null) {
			return ResponseEntity.ok("Edited Successfully...");

		}
		return ResponseEntity.ok("Edit was Unsucessful...");

	}

	@PostMapping("/subject/new")
	public ResponseEntity<String> addNewSubject(@RequestBody SubjectDto ed) {

		Subject s = service.addNew(ed);
		if (s != null) {
			return ResponseEntity.ok("New Subject Added Sucessfully...");
		} else {
			return ResponseEntity.ok(" Unscessufull to add...");
		}
	}
	
	@DeleteMapping("subject/delete/{sid}")
	public ResponseEntity<String> delById(@RequestBody SubjectDto dd){
		Subject s = service.deleteById(dd);
		if (s != null) {
			return ResponseEntity.ok("Deleted Sucessfully...");
		} else {
			return ResponseEntity.ok(" Unscessufull to Delete...");
		}
		
	}
}
