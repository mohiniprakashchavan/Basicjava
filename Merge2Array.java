package arrayprogram;

import java.util.Scanner;

public class Merge2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n1, len1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Array size");
		int len1=sc.nextInt();
		int arr1[]=new int[len1];
		
		
		System.out.println("Enter "+len1+ " element");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the second Array size");
		int len2=sc.nextInt();
		int arr2[]=new int[len1];
		
		
		System.out.println("Enter "+len2+ " element");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		//arr2[]
		int len3=len1+len2;
		int arr3[]=new int[len3];	
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];		
		}
		//arr1.length=3
		for(int i=0;i<arr2.length;i++)
		{
			arr3[len1+i]=arr2[i];
		}
		
	System.out.println("Merge array");
	
	for(int i=0;i<arr3.length;i++)
	{
		System.out.println("arr3["+i+"]="+arr3[i]);
	}
	}

}
