package arrayprogram;

public class ArrayDemo {

	public static void main(String[] args) {
	 //declare and initialize array
		int arr[]= {4,5,7,8,9};//4*5=20 bytes  
		/*System.out.println("first array element " +arr[0]);
		System.out.println("second array element "+arr[1]);
		System.out.println("Third array element "+arr[2]);
		System.out.println("four array element "+arr[3]);
		System.out.println("fifth array element "+arr[4]);
		*/
		System.out.println("number of elements in array "+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]= " +arr[i]);
		}
		
		//sum of array element
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array element is="+sum);
		
//average of array element
		float avg=((float)sum/arr.length);
		System.out.println("Avg of array element is="+avg);
		System.out.printf("%.2f \n",avg);

//largest element
		int max=arr[0],i;
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("largest element in array="+max);
		
//smallest element
		int min= arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("smallest element in array="+min);
	}

}
