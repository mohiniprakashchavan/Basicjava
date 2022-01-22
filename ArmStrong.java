package LoopProgram;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,d,backnum;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		backnum=num;
		while(num>0)//153>0  15>0
		{
			d=num%10;
			sum=sum+d*d*d;//sum=0+3*3*3=27 sum=27+125=152
			num=num/10;//15  15/10=1 num=1/10=0
		}
		if(sum==backnum)//153==1
		{
			System.out.println(backnum+" is aremstrong number");
		}
		else
		{
			System.out.println(backnum+" not a armstrong number");
		}

	}

}
