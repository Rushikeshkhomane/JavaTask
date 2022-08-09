package javaConditionalStatement;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		
		int maths,physics,chemistry,total=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter maths score (out of 100): ");
		maths=scanner.nextInt();
		
		System.out.println("Enter physics score (out of 100): ");
		physics=scanner.nextInt();
		
		System.out.println("Enter chemistry score (out of 100): ");
		chemistry=scanner.nextInt();

		scanner.close();
		
		if(maths>=50 && physics>=50 && chemistry>=50)
		{
			//total=maths+physics+chemistry;
			if(maths+physics+chemistry>=200)
			{
				System.out.println("Qualified");
				
			}
			else
			{
				System.out.println("not qualify because total is not greater than 200");
			}
			
		}
		else
		{
			System.out.println("better luck next time!!!"
					+ "Jee exam is not qualify beacuse of all subjects marks individually is not greater than 50");
		}
		
	}

}
