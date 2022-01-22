package userinput;

import java.util.Scanner;

public class OpMenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float num1,num2;
		int choice;
		
		System.out.println("Enter first number");
		num1=sc.nextFloat();
		
		System.out.println("Enter second Number");
		num2=sc.nextFloat();
		
		
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your Choice");
		choice=sc.nextInt();
		
		switch(choice) {
		
		 case 1:
			     float add=num1+num2;
			     System.out.println("Addition of first number "+num1+ " and second number "+num2+" is "+add);
		         break;
		
		 case 2:
			      float sub=num1-num2;
			      System.out.println("Substraction of first number "+num1+ " and second number "+num2+" is "+sub);
		          break;
		
		 case 3:
			     float mult=num1*num2;
			     System.out.println("Multiplication of first number "+num1+ " and second number "+num2+" is "+mult);
		         break;
		
		 case 4:
			      float div=num1/num2;
			      System.out.println("Division of first number "+num1+ " and second number "+num2+" is "+div);
		          break;
		
		 default:
			 
			         System.out.println("Invalid Data");
	
		}
		

	}

}
