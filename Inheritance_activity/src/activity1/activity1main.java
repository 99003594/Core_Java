package activity1;
import java.util.Scanner;
public class activity1main 
{
	public static void main(String args[])
	{
		vehicle a=new vehicle();
		TwoWheeler b=new TwoWheeler();
		FourWheeler c=new FourWheeler();
		System.out.println("1.Four Wheeler\r\n"+"2.Two Wheeler \r\n"+"Enter Vehicle Type:");
		int x = 0;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		
		int z;
		switch (x)
		{
		case 1: 
			System.out.println("Vehicle Make:");
			a.setMake(sc.next());
			System.out.println("Vehicle Number:");
			a.setMake(sc.next());
			System.out.println("Fuel Type:");
			System.out.println("1.Petrol \r\n 2.Diesel");
			Scanner s=new Scanner(System.in);
			z=sc.nextInt();
			switch (z)
			{
			case 1:a.setFuelType("petrol");
			break;
			case 2:a.setFuelType("diesel");
			break;
			}
			System.out.println("Fuel Capacity: ");
			a.setFuelCapacity(sc.nextInt());
			System.out.println("Engine CC:");
			a.setCc(sc.nextInt());
			System.out.println("Audio System: ");
			c.setAudioSystem(sc.next());
			System.out.println("Number of Doors:");
			c.setNumberOfDoors(sc.nextInt());
			
			
			a.displayMake();
			System.out.println("***volvo***");
			System.out.println("---Basic Information---");
			a.displayBasicInfo();
			System.out.println("---Detail Information--");
			c.displayDetailInfo();
		break;
		case 2: 
			System.out.println("Vehicle Make:");
			a.setMake(sc.next());
			System.out.println("Fuel Type:");
			System.out.println("1:petrol \r\n 2:diesel");
			Scanner s1=new Scanner(System.in);
			z=s1.nextInt();
			switch (z)
			{
			case 1:a.setFuelType("petrol");
			break;
			case 2:a.setFuelType("diesel");
			break;
			}
			System.out.println("Fuel Capacity: ");
			a.setFuelCapacity(sc.nextInt());
			System.out.println("cc:");
			a.setCc(sc.nextInt());
			System.out.println("KickStartAvailable");
			b.setKickStartAvailable(true);
			
			a.displayMake();
			System.out.println("***suzuki***");
			System.out.println("__Basic Information__");
			a.displayBasicInfo();
			System.out.println("__Detail Information__");
			b.displayDetailInfo();
		break;
		}
		
		
	}

	
}