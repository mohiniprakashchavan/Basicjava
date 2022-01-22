package arrayprogram;

import java.util.Scanner;

public class OccuranceOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n=sc.nextInt();
		a=new int[n];
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter search element");
		int key=sc.nextInt();
		
		//linear search
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				pos=pos++;
				
			}
		}
		
		if(pos>0)
		{
			System.out.println(" element occurances "+pos);
		}
		else {
			System.out.println("Element not found");
		}


	}

}
