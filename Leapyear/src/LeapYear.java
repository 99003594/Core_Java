

import java.util.Scanner;
public class LeapYear 
{
	static int checkLeapYear(int year)
	{
		if((year>0)&&(year%100==0) && (year%400==0))
		{
			return 1;
		}
		else if(year<0)
		{

			return -1;
		}
		else
		{
			return 0;
		}
	}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int year=sc.nextInt();
	
			switch(checkLeapYear(year))
			{
			case 0:
				System.out.println("no");
				break;
			case 1:
				System.out.println("yes");
				break;
			case -1:
				System.out.println("invalid input");
				break;
			}//if u want to use switch statements
		}
}
