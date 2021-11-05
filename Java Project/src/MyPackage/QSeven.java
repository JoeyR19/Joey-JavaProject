package MyPackage;

import java.io.*;
import java.lang.*;
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

class Sortbyage implements Comparator<Employee> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Employee a, Employee b)
    {
        return a.age - b.age;
    }
}

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


public class QSeven {
	
	public static void Sort() {
		ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(new Employee("Jenny", "Manager", 26));
        ar.add(new Employee("Bob", "Supervisor", 23));
        ar.add(new Employee("Mike", "Human Resources", 30));
        
        System.out.println("Q7:");
  
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyage());
  
        System.out.println("\nSorted by age");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyname());
  
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        
        Collections.sort(ar, new Sortbydept());
        
        System.out.println("\nSorted by dept");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
	}

}
