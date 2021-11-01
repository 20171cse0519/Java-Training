package com.assessment3;
import java.util.*;

public class Employee {
	
	int netsalary;
	
	public void calculateSalary(int basicsalary, String emp_type) {
		if((basicsalary<=10000) && emp_type.equalsIgnoreCase("Not_Software_Engineer")) {
			netsalary = (int) (basicsalary+(0.2*basicsalary)+(0.8*basicsalary))-2500;
		}
		else if((basicsalary>=10001 && basicsalary<=20000) && emp_type.equalsIgnoreCase("Not_Software_Engineer")) {
			netsalary = (int) (basicsalary+(0.25*basicsalary)+(0.9*basicsalary))-2500;
		}
		else if((basicsalary>=20001 && basicsalary<=50000) && emp_type.equalsIgnoreCase("Not_Software_Engineer")) {
			netsalary = (int) (basicsalary+(0.3*basicsalary)+(0.95*basicsalary))-2500;
		}
		
		else if((basicsalary>=50001)&&emp_type.equalsIgnoreCase("Software_Engineer")) {
			netsalary = (int) (basicsalary+(0.3*basicsalary)+(0.95*basicsalary)+(0.2*basicsalary))-2500;
		}
		
		System.out.println("Netsalary: "+netsalary);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Note: If not a software engineer basic salary is upto 50000");
		System.out.println("Enter whether software engineer or not");
		String emp_type = sc.next();
		System.out.println("Enter employeeID");
		int employeeid = sc.nextInt();
		System.out.println("Enter employee name");
		String employeename = sc.next();
		System.out.println("Enter basic salary");
		int basicsalary = sc.nextInt();
		System.out.println("Employee type: "+emp_type);
		System.out.println("EmployeeID: "+employeeid);
		System.out.println("Employee name: "+employeename);
		int sa;
		int transportallowance;
		int tax = 2500;
		
		Employee e = new Employee();
		e.calculateSalary(basicsalary, emp_type);
		
		

	}

}
