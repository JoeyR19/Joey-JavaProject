package MyPackage;

public class Employeea implements Comparable <Employeea>{
	String name;
	String department;
	int age;
	Employeea (String name, String department, int age) {
		this.name = name;
		this.department = department;
		this.age = age;
}

public int compareTo(Employeea em) {
	if (age == em.age) {  
		return 0;  
	} else if (age > em.age) {  
		return 1;  
	} else {  
		return -1;  
	}

}


}