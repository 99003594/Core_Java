package activity_Employee;
import java.util.*;  
import java.io.*; 
class NameComparator implements Comparator{  
public int compare(Object o1,Object o2){  
	Employee s1=(Employee)o1;  
	Employee s2=(Employee)o2;  
  
return s1.employeeName.compareTo(s2.employeeName);  
} }
public class EmployeeMain {
	public static void main(String args[]){  
	ArrayList al=new ArrayList();  
	al.add(new Employee(99003594,"Geethika",23000));  
	al.add(new Employee(99003598,"Sowmya",27000));  
	al.add(new Employee(99003597,"Dharani",21000));  
	System.out.println("Sorting by Name");  
	Collections.sort(al,new NameComparator());  
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	Employee st=(Employee)itr.next();  
	System.out.println(st.employeeId+" "+st.employeeName+" "+st.salary);  
	} 
	}
}