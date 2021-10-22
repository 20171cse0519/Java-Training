package com.associationdemo;

public class StudentDetails  {

	public static void main(String[] args) {
		
		UndergradStudent u = new UndergradStudent();
		u.setName("Prajwal");
		u.setRollno(101);
		u.setCity("Bangalore");
		u.setYear(1998);
		System.out.println(u.getName()+"\n"+u.getRollno()+"\n"+u.getCity()+"\n"+u.getYear());
		u.undergradStudentBranch();
		u.undergradStudentSociety();
		

	}

}
