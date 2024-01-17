package task11;

import java.util.Scanner;

public class ExceptionProgram {

	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of A :" );
		int a=sc.nextInt();
		System.out.println("Enter the value of B:" );
		int b=sc.nextInt();
		
		try {
			
	int c=a/b;
		
	}catch(ArithmeticException ae) {
		
		System.out.println("Enter the Valid number for B");
	}
		

		
	
	}
	}
	
	
	

