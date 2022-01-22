package Nestedloop;

import java.util.Scanner;

public class PrimeNumber1_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,s;
		System.out.println("Enter the start value");
		s=sc.nextInt();
		System.out.println("Enter the n value");
		n=sc.nextInt();
		
		int i,j,c=0;
		for(i=s;i<n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
		
			}
			
			if(c==2) {
				if(i==31)
				{
					break;
				}
				
				if(i==23 || i==29 )
					continue;
			System.out.print(i+" ");
			}
			
		}
		

	}

}
