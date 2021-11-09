package MyPackage;

//import java.io.*;
//import java.lang.*;
import java.util.*;

class Employee {
	String name;
	String department;
	int age;
	
	public Employee (String name, String department, int age) {
		this.name = name;
		this.department = department;
		this.age = age;
	}
	public String toString()
    {
        return this.name + " " + this.department + " " + this.age;
    }
}

class Sortbyeverything implements Comparator<Employee> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Employee a, Employee b)
    {
    	if (a.name == b.name) {
    		//Sort by dept?
    		if (a.department == b.department) {
    			return a.age - b.age;
    		}
    		else 
    			return a.department.compareTo(b.department);
    	}
    	
    	else
    		return a.name.compareTo(b.name);
    }
}

/*
class Sortbyname implements Comparator<Employee> {
    	    // Used for sorting in ascending order of
    	    // roll number
	public int compare(Employee a, Employee b)
	{
		return a.name.compareTo(b.name);
	}
}		
    		
class Sortbydept implements Comparator<Employee> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Employee a, Employee b)
    {
        return a.department.compareTo(b.department);
    }
}

*/


public class QSeven {
	
	public static void Sort() {
		
		String namea = "Mike";
		String nameb = "Jenny";
		String namec = "Jenny";
		
		String depta = "Manager";
		String deptb = "Human Resources";
		String deptc = "Supervisor";
		
		int a = 26;
		int b = 30;
		int c = 23;
		
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(new Employee(namea, depta, a));
        ar.add(new Employee(nameb, deptb, b));
        ar.add(new Employee(namec, deptc, c));
        
        
        
        System.out.println("Q7:");
  
        
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
        	System.out.println(ar.get(i));
        
        	
        Collections.sort(ar, new Sortbyeverything());
      	  
        System.out.println("\nSorted");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        
        /*
        else if (depta != deptb && deptb != deptc && depta != deptc) {
        	
        	Collections.sort(ar, new Sortbydept());
	        
	        System.out.println("\nSorted by dept");
	        for (int i = 0; i < ar.size(); i++)
	            System.out.println(ar.get(i));
	        
        }
        
        else {
        	Collections.sort(ar, new Sortbyage());
      	  
	        System.out.println("\nSorted by age");
	        for (int i = 0; i < ar.size(); i++)
	            System.out.println(ar.get(i));
	        
        }
        */
	}

}
