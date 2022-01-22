package userinput;

import java.util.Scanner;

public class DaysToSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int days;
		System.out.println("Enter days");
		days=sc.nextInt();
		
		double seconds;
		seconds=days*24*60*60; 
		System.out.println(seconds);

	}

}
