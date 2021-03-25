package exceptionhandling;

import java.util.Scanner;

public class Activity3 {
	public static void main(String[] args) throws Exception{
          Scanner sc = new Scanner(System.in);  
  		System.out.println("Enter the player name:");
  		String name=sc.nextLine();
  		System.out.println("Enter the player age:");
  		int age=sc.nextInt();        
 
          
              if(age > 19)
              {
            	  System.out.println("Player name:"+name);
       		   System.out.println("Player age:"+age); 
       		    
              }
          
	else{
          
        	 
        	  System.out.println("CustomException: InvalidAgeRangeException");
        	  System.exit(0);
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