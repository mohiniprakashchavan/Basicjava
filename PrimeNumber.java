package LoopProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c=c+1;
				
			}
			
		}
		if(c==2)
		{
		  System.out.println(num+"  is prime number");

		}
		else
		{
			System.out.println(num+" not  prime number");

		}
		
	
	}

}
