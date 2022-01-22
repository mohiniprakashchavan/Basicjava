package userinput;
import java.util.Scanner;
public class FindAgeInSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year,month,days,minute,second;
		
		System.out.println("Enter your year");
		year=sc.nextInt();
		
		month=12*year;
		days=365*year;
		minute=days*24*60;
		second=minute*60;
		System.out.println("the month are:"+month);
		System.out.println("The days are :"+days);
		System.out.println("The minute are:"+minute);
		System.out.println("The second in one year are "+second);

	}

}
