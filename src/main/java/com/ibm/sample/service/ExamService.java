package com.ibm.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.sample.entity.StudentMarks;
import com.ibm.sample.repo.StudentMarksRepo;

@Service
public class ExamService {
	
	@Autowired
	StudentMarksRepo marksRepo;
	

	public List<StudentMarks> allMarksToDB(List<StudentMarks> marksList) {
		
		return marksRepo.saveAll(marksList);
	}

}
