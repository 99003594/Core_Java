import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class CRUD 
{
	public static void main(String[] args) {
		System.out.println("CRUD Application");
		HashMap<String,String> h=new HashMap<String,String>();
		
		while(true)
		{

			System.out.println("choose an option from the menu");
			System.out.println("1)Create\n2)Read\n3)update\n4)Delete");
			Scanner sc = new Scanner(System.in);
		     int op = sc.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("Enter how many keys You require:");
		     int n = sc.nextInt();
			for(int i=1;i<=n;i++)
			{
			System.out.println("enter the key "+i);
			String keys=sc.next();
			System.out.println("enter the value "+i);
			String val=sc.next();
			h.put(keys, val);
			}
			break;
	    case 2:
	    	 for (HashMap.Entry<String,String> entry : h.entrySet())
	    	 {
	             System.out.println("Key = " + entry.getKey() +
	                              ", Value = " + entry.getValue());
	    	 }
	    	 System.out.println(""+h);
	    	 break;
	    case 3:
	    	System.out.println("How many keys you want to update:");
	    	int u = sc.nextInt();
	    	for(int i=1;i<=u;i++)
	    	{
	    	System.out.println("enter the key to update-"+i);
	        String key=sc.next();
	        System.out.println("enter value to update-"+i);
	        String value=sc.next();
	        h.put(key, value);
	    	}
	    	break;
	    case 4:
	    	System.out.println("enter the key to delete");
	    	String keyy=sc.next();
		    h.remove(keyy);
	    	break;
	    default:
	    	System.out.println("please check the input you have given.");
	    	break;
	}
	}
}
}
