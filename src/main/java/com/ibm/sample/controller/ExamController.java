package com.ibm.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.sample.entity.StudentMarks;
import com.ibm.sample.service.ExamService;

@RestController
public class ExamController {
	
	@Autowired
	ExamService examService;
	
	
	
	@PostMapping("/exam/marks/add")
	public List<StudentMarks>  addAllStuMarks(@RequestBody List<StudentMarks> marksList ){
		
		return examService.allMarksToDB(marksList);
	}

}
