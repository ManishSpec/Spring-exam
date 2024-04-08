package com.ibm.sample.model;

import com.ibm.sample.entity.StudentMarks;

public class StudentResult {
	
	private int rollno;
	private String name;
	private String collegeName;
	private int maths;
	private int sci;
	private int sco;
	private int eng;
	private int hindi;
	
	private String mathsRes;
	private String sciRes;
	private String scoRes;
	private String engRes;
	private String hindiRes;
	
	private String finalRes;

	public StudentResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentResult(StudentMarks stuMarks) {
		super();
		this.rollno = stuMarks.getRollno();
		this.name = stuMarks.getName();
		this.collegeName = stuMarks.getCollegeName();
		this.maths = stuMarks.getMaths();
		this.sci = stuMarks.getSci();
		this.sco = stuMarks.getSco();
		this.eng = stuMarks.getEng();
		this.hindi = stuMarks.getHindi();
		this.mathsRes = "Fail";
		this.sciRes = "Fail";
		this.sciRes = "Fail";
		this.engRes = "Fail";
		this.hindiRes = "Fail";
	
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getSco() {
		return sco;
	}

	public void setSco(int sco) {
		this.sco = sco;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public String getMathsRes() {
		return mathsRes;
	}

	public void setMathsRes(String mathsRes) {
		this.mathsRes = mathsRes;
	}

	public String getSciRes() {
		return sciRes;
	}

	public void setSciRes(String sciRes) {
		this.sciRes = sciRes;
	}

	public String getScoRes() {
		return scoRes;
	}

	public void setScoRes(String scoRes) {
		this.scoRes = scoRes;
	}

	public String getEngRes() {
		return engRes;
	}

	public void setEngRes(String engRes) {
		this.engRes = engRes;
	}

	public String getHindiRes() {
		return hindiRes;
	}

	public void setHindiRes(String hindiRes) {
		this.hindiRes = hindiRes;
	}

	public String getFinalRes() {
		return finalRes;
	}

	public void setFinalRes(String finalRes) {
		this.finalRes = finalRes;
	}
	
	
	
	
	
	
	

}
