package com.ibm.sample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentMarks {
	
	@Id
	private int rollno;
	private String name;
	private String collegeName;
	private int maths;
	private int sci;
	private int sco;
	private int eng;
	private int hindi;
	public StudentMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentMarks(int rollno, String name, String collegeName, int maths, int sci, int sco, int eng, int hindi) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.collegeName = collegeName;
		this.maths = maths;
		this.sci = sci;
		this.sco = sco;
		this.eng = eng;
		this.hindi = hindi;
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
	
	
	
	
	
	

}
