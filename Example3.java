package javaConditionalStatement;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter age: ");
		
		age=scanner.nextInt();
		
		scanner.close();
		
		if(age>=18)
		{
			
			if(age>=21)
			{
				System.out.println("person age is major and elligible for marry");
			}
			else
			{
				System.out.println("person age is major and not elligible for marry");
			}
			
		}
		else
		{
			System.out.println("Person age is minor");
		}

	}

}
