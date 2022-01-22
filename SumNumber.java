package LoopProgram;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum,i,n;
		i=1;
		sum=0;
		Scanner  sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		n=sc.nextInt();
		
		while(i<=n)
			{
			sum=sum+i;
			i++;
	
			}
		System.out.println("sum of " +n+" numbers "+sum);

		
		

	}

}
