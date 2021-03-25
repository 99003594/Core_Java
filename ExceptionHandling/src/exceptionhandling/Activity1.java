package exceptionhandling;
import java.io.*;
import java.util.*;
public class Activity1 {
	    Scanner scan=new Scanner(System.in);
	    float runs, balls;
	    float runRate;
	    public void input(){
	        try{
	            System.out.println("Enter the total runs scored");
	            runs=scan.nextInt();
	            System.out.println("Enter the total overs faced ");
	            balls=scan.nextInt();
	        }
	        catch(InputMismatchException e) {
	        	  System.out.println("java.lang.NumberFormatException");
		            System.exit(0);
	        }
	    }
	    public void compute(){
	        try
	        {
	        	runRate=runs/balls;
	        System.out.println("Current Run Rate:"+runRate);
	        }
	        catch(ArithmeticException e)  
            {  
             System.out.println("java.lang.ArithmeticException"); 
             System.exit(0);
            }
	    }

	    public static void main(String[] args){
	    	Activity1 obj=new Activity1();
	        obj.input();
	        obj.compute();
	    }
	}
 