package com.ibm.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.sample.entity.StudentMarks;

public interface StudentMarksRepo extends JpaRepository<StudentMarks, Integer>{

}
