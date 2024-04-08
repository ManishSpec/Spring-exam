package com.ibm.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.sample.entity.StudentMarks;
import com.ibm.sample.model.StudentResult;
import com.ibm.sample.repo.StudentMarksRepo;

@Service
public class ExamService {
	
	@Autowired
	StudentMarksRepo marksRepo;
	

	public List<StudentMarks> allMarksToDB(List<StudentMarks> marksList) {
		
		return marksRepo.saveAll(marksList);
	}


	public StudentResult getResults(int rollno) {
		// TODO Auto-generated method stub
		
		StudentMarks stuMarks = marksRepo.findById(rollno).orElse(new StudentMarks());
		
		StudentResult stuRes = new StudentResult(stuMarks);
		int count =0;
		
		if( (stuMarks != null) &&(stuMarks.getRollno() == rollno)) {
			
			if(stuMarks.getMaths() > 35) {
				stuRes.setMathsRes("Pass");
				count++;
			}
			if(stuMarks.getSci() > 35) {
				stuRes.setSciRes("Pass");
				count++;
			}
			if(stuMarks.getSco() > 35) {
				stuRes.setScoRes("Pass");
				count++;
			}
			if(stuMarks.getEng() > 35) {
				stuRes.setEngRes("Pass");
				count++;
			}
			if(stuMarks.getHindi() > 35) {
				stuRes.setHindiRes("Pass");
				count++;
			}
			
			if(count == 5) {
				stuRes.setFinalRes("Pass");
			}
			else {
				stuRes.setFinalRes("Fail");
			}
			
			
		}
		
		
		return stuRes;
	}

}
