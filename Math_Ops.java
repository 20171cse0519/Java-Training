import java.util.*;
public class Math_Ops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		System.out.println("Enter your choice: 1)Add 2)Avg 3)Even/odd 4)Positive/Negative 5)Prime or not 6)return");
		int choice = sc.nextInt();
		
		
		
	do {
		
		switch (choice){
		case 1: System.out.println("Add=" +(num1+num2));
				break;
				
		case 2: System.out.println("Avg=" +((num1+num2)/2)); 
				break;
				
		case 3:	if(num1%2==0 && num2%2==0) {
					System.out.println("Both are even");
				}
				else if(num1%2==1 && num2%2==1) {
					System.out.println("Both are odd");
					}
				else if(num1%2==0 && num2%2==1) {
					System.out.println("num1 is even and num2 is odd");
					}
				else if(num1%2==1 && num2%2==0) {
					System.out.println("num1 is odd and num2 is even");
					}
				break;
		case 4: if(num1>0&&num2<0) {
					System.out.println("num2 is negative and num1 is positive");
					}
				else if(num1<0 && num2>0) {
					System.out.println("num1 is negative and num2 is positive");
				}
				else if(num1<0 && num2<0) {
					System.out.println("Both are negative");
				}
				else if(num1>0 && num2>0) {
					System.out.println("Both are positive");
				}
				
				break;
				
		case 5: boolean flag = false;
	    		for (int i = 2; i <= num1/2; ++i) {
	        
	    			if (num1 % i == 0) {
	    				flag = true;
	    				break;
	    			}
	    		}

	    			if (!flag)
	    				System.out.println("num1 is a prime number.");
	    			else
	    				System.out.println("num1 is not a prime number.");
	    			
	    			
	    			
	    			for (int i = 2; i <= num2/2; ++i) {
	    		        
		    			if (num2 % i == 0) {
		    				flag = true;
		    				break;
		    			}
		    		}

		    			if (!flag)
		    				System.out.println("num2 is a prime number.");
		    			else
		    				System.out.println("num2 is not a prime number.");
		    			
		    		
		    		break;
		    		
		    		
		default: System.exit(0);
		
		
		}
		System.out.println("Enter next choice");
		choice = sc.nextInt();
	}
	
	while(choice<=6);
	
	

		
		
			
		}
}
		
		
		
		
		
				
		
			
		

	


