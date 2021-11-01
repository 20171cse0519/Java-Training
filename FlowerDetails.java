package com.assessment1;

import java.util.ArrayList;
import java.util.*;

public class FlowerDetails {
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<FlowerDemo> list1 = new ArrayList<>();
		list1.add(new FlowerDemo("India","Lotus"));
		list1.add(new FlowerDemo("Pakistan","Jasmine"));
		list1.add(new FlowerDemo("Nepal","Lali Gurans"));
		
		
		ArrayList<FlowerDemo> list2 = new ArrayList<>();
		list2.add(new FlowerDemo("Germany","Corn flower"));
		list2.add(new FlowerDemo("France","Lily"));
		list2.add(new FlowerDemo("Greece","Acanthus mollis"));
		
		
		ArrayList<FlowerDemo> list3 = new ArrayList<>();
		list3.add(new FlowerDemo("Egypt","Blue lotus"));
		list3.add(new FlowerDemo("Nigeria","Yellow trumpet"));
		list3.add(new FlowerDemo("Kenya","Orchid"));
		
		System.out.println("Enter the continent: Asia or Europe or Africa");
		String continent = sc.nextLine();
		if(continent.equals("Asia")) {
			for(FlowerDemo data:list1) {
				System.out.println("Country Name: "+data.countryname+"\n"+"National Flower: "+data.nationalflower);
			}
			
		}
		
		else if(continent.equals("Europe")) {
			for(FlowerDemo data:list2) {
				System.out.println("Country Name: "+data.countryname+"\n"+"National Flower: "+data.nationalflower);
			}
			
		}
		
		else if(continent.equals("Africa")) {
			for(FlowerDemo data:list3) {
				System.out.println("Country Name: "+data.countryname+"\n"+"National Flower: "+data.nationalflower);
			}
			
		}
		
		
		
	}

}
