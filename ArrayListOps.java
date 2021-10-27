package com.collectionsdemo;
import java.util.*;

public class ArrayListOps {

	public static void main(String[] args) {
		
		int sum=0;
	    double median=0;
		double mean=0;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter arraylist elements");
		for(int i=0; i<size; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("arraylist elements are:");
		for(int i:list) {
			System.out.println(i);
		}
		
		for(int i:list) {
			sum+=i;
		}
		mean = (float)sum/size;
		
		Collections.sort(list);
		System.out.println(list);
		if(size%2==1) {
			median = list.get((int)size/2);
		}
		else {
			temp = list.get(size/2)+list.get((size-2)/2);
			median =  (double)temp/2;
		}
		
		System.out.println("Sum of elements: "+sum);
		System.out.println("Mean of elements "+mean);
		System.out.println("Median: "+median);
		
		
		


	}

}
