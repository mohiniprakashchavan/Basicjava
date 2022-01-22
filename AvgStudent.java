package userinput;

import java.util.Scanner;

public class AvgStudent {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String Student_name;
		
		int Math,Science,English,Marathi,Hindi;
		System.out.println("Enter Student Name");
		Student_name=sc.next();
		
		System.out.println("Enter Marathi Marks");
		Marathi=sc.nextInt();
		
		System.out.println("Enter Hindi Marks");
		Hindi=sc.nextInt();
		
		System.out.println("Science Marks");
		Science=sc.nextInt();

		System.out.println("Enter English Marks");
		English=sc.nextInt();
		

		System.out.println("Enter Maths Marks");
		Math=sc.nextInt();
		
		float avg=(Marathi+Hindi+English+Science+Math)/5;

		System.out.println("Student Name="+Student_name);
		System.out.println("Marathi Marks="+Marathi);
		System.out.println("Hindi Marks="+Hindi);
		System.out.println("English Marks="+English);
		System.out.println("Science Marks="+Science);
		System.out.println("Math Marks="+Math);
		
		System.out.println("Average of Five subjects="+avg);

		
		
	}

}
