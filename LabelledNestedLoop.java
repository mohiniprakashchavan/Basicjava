package Nestedloop;

public class LabelledNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++)
			{
				if(i==3)
				{
					break;
				}
				else {
					System.out.println(" i "+i+" j "+j);
				}
			}
			System.out.println();

		}

	}

}
