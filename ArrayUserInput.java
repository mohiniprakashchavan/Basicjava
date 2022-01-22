package arrayprogram;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int arr[];
		int size,element;
		System.out.println("Enter the array size");
		size=sc.nextInt();
	    arr=new int[size];
		
	    
	    //input element
		System.out.println("Enter "+size+" elements");

	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
		
	    //display element
	    System.out.println("Array elements are:");
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	    
	    int max=arr[0],i;
	    for(i=1;i<arr.length;i++)
	    {
	    	if(arr[i]>max)
	    	{
	    		max=arr[i];
	    	}
	    }
	    
	    System.out.println("Max number is="+max);
	    
	    
	    int min=arr[0];
	    for(i=1;i<arr.length;i++)
	    {
	    	if(arr[i]<min)
	    	{
	    		min=arr[i];
	    	}
	    }
	    
	    System.out.println("Min number is="+min);
	    
	   
		
		//sum of array element
		int sum=0;
		for( i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array element is="+sum);
		
		//average of array element
				float avg=((float)sum/arr.length);
				System.out.println("Avg of array element is="+avg);
				System.out.printf("%.2f \n",avg);
	}

}
