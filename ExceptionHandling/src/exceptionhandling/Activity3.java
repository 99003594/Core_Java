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
