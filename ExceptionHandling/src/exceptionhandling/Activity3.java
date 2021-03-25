package exceptionhandling;

import java.util.Scanner;

public class Activity3 {
	public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age");
 
          int age = sc.nextInt();         //Taking input from user
 
          try
          {
              if(age < 0)
              {
                  throw new Exception();    //throws an Exception if age is negative
              }
          }
          catch(Exception ex)
          {
              System.out.println(ex);     //Prints exception description
          }
    }
}
/*    CustomException()
    {
        System.out.println("CustomException: InvalidAgeRangeException");
    }
}

public class Q3 {
	public static void main(String[] args) throws CustomException {
		String pname;
		int page;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name:");
		pname=sc.nextLine();
		System.out.println("Enter the player age:");
		page=sc.nextInt();
		if(page<19)
		{
		    throw new CustomException();
		}
		else
		{
		   System.out.println("Player name:"+pname);
		   System.out.println("Player age:"+page); 
		}
		
	}*/