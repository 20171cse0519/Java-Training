package com.associationdemo;

public class UndergradStudent extends Student {
	
	int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void undergradStudentBranch() {
		Branch b = new Branch();
		b.studiesBranch();
	}
	
	public void undergradStudentSociety() {
		Society s = new Society();
		s.collegeSociety();
	}
	
	
}
