package LoopProgram;

import java.util.Scanner;

public class SumOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,sum=0;
		System.out.println("Enter any number");
		System.out.println("To find sum of all odd number and even number");
		int n=sc.nextInt();
		int oddsum=0,evensum=0;
		for(i=1;i<=n;i++)
		{
			if(i%2==0) {
				evensum=evensum+i;
			}
			else {
				oddsum=oddsum+i;
		
			}
		}
		
		System.out.println("odd sum="+oddsum);
		System.out.println("even sum="+evensum);

	}

}
