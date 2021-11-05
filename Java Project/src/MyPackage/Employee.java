package MyPackage;

public class Employee implements Comparable <Employee>{
	String name;
	String department;
	int age;
	Employee (String name, String department, int age) {
		this.name = name;
		this.department = department;
		this.age = age;
}

public int compareTo(Employee em) {
	if (age == em.age) {  
		return 0;  
	} else if (age > em.age) {  
		return 1;  
	} else {  
		return -1;  
	}

}


}