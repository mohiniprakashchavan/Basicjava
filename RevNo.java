package LoopProgram;

import java.util.Scanner;

public class RevNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,i,digit,rev;
		rev=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		while(num>0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("reverse number is "+rev);

	}

}
