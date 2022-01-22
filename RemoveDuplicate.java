package arrayprogram;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,8,5,2,3,9,4};
		int k=0;
	outer:
		for(int i=0;i<a.length;i++)
		{
			inner:
			for( int j=0;j<i;j++)
			{
			   if(a[i]==a[j])
			   {
				continue outer;
			   }  
			   
			}
			
			//System.out.println(a[i]);
			k++;
		}
	int b[]=new int[k];
	System.out.println("non duplicate values");
	

	}

}
