
//s=1+1/2!+1/3!+1/4!+.........+1/n!
package Nestedloop;

import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0.0f;
		int n,fact=1;
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				fact=fact*j;
				
			}
			sum=sum+((float)1/fact);
		}
		
	
       System.out.println("sum of given series "+sum);
	}	
}
