package com.assessment2;
import java.util.*;

public class EnjoyRide {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int totaladultfare;
		int totalchildfare;
		int totalfare;
		System.out.println("Enter the ride you want to enjoy: 1)Alibaba  2)AlpineSlide  3)BumpperCar  4)BaloonRace");
		String ride = sc.next();
		System.out.println("Enter the number of adults");
		int adultcount = sc.nextInt();
		System.out.println("No of adults: "+adultcount);
		System.out.println("Enter the number of children");
		int childcount = sc.nextInt();
		System.out.println("No of children: "+childcount);
		System.out.println("Enter the duration");
		int duration = sc.nextInt();
		System.out.println("Duration: "+duration);
		
		if(ride.equalsIgnoreCase("Alibaba")) {
			
			totaladultfare = 50*adultcount*duration;
			totalchildfare = 40*childcount*duration;
			totalfare = totaladultfare+totalchildfare;
			System.out.println("Total fare for adults: "+totaladultfare+"$");
			System.out.println("Total fare for children: "+totalchildfare+"$");
			System.out.println("Toal fare: "+totalfare+"$");
		}
		
		else if(ride.equalsIgnoreCase("AlpineSlide")) {
			
			totaladultfare = 60*adultcount*duration;
			totalchildfare = 30*childcount*duration;
			totalfare = totaladultfare+totalchildfare;
			System.out.println("Total fare for adults: "+totaladultfare+"$");
			System.out.println("Total fare for children: "+totalchildfare+"$");
			System.out.println("Toal fare: "+totalfare+"$");
		}
		
		else if(ride.equalsIgnoreCase("BumpperCar")) {
			
			totaladultfare = 45*adultcount*duration;
			totalchildfare = 25*childcount*duration;
			totalfare = totaladultfare+totalchildfare;
			System.out.println("Total fare for adults: "+totaladultfare+"$");
			System.out.println("Total fare for children: "+totalchildfare+"$");
			System.out.println("Toal fare: "+totalfare+"$");
		}
		
		else if(ride.equalsIgnoreCase("BaloonRace")) {
			
			totaladultfare = 70*adultcount*duration;
			totalchildfare = 60*childcount*duration;
			totalfare = totaladultfare+totalchildfare;
			System.out.println("Total fare for adults: "+totaladultfare+"$");
			System.out.println("Total fare for children: "+totalchildfare+"$");
			System.out.println("Toal fare: "+totalfare+"$");
		}
		
		
		
		
		
		

	}

}
