package userinput;

import java.util.Scanner;

public class FindSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int  a,b,c,small;
		
		
		System.out.println("Enter a value");
		a=sc.nextInt();
		
		System.out.println("Enter b value");
		b=sc.nextInt();
		
		System.out.println("Enter c value");
		c=sc.nextInt();
		
	    small=(a<b && a<c)? a:(b<a && b<c)? b:c;
	    System.out.println("Smallest number among three no "+a+" "+b+" "+c+" is "+small);
		

	}

}
