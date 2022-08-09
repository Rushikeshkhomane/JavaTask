package javaConditionalStatement;

import java.util.Scanner;

/*
 *nested if else:
 *      if we want to validate condition within a condition then we can use nested if else.
 */
public class Example1 {

	public static void main(String[] args) {
		
		
		int number;
		 Scanner scanner=new Scanner(System.in);
		 
		 System.out.println("Enter any number: ");
		 number=scanner.nextInt();
		 
		 scanner.close();
		 
		 if(number>0)
		 {
			 System.out.println("Positive");
			 if(number%2==0)
			 {
				 System.out.println("even");
			 }
			 else
			 {
				 System.out.println("odd");
			 }
		 }
		 else
		 {
			 System.out.println("negative");
		 }
		
		

	}

}
