
class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	int salary;
	
	void printSalary() {
		System.out.println("£"+salary);
	}		
	}
class Employee extends Member {
	String specialization;
	void employee() {
		System.out.println(name +" "+ age +" "+phoneNumber+" "+address+" £"+salary+" "+specialization);
	}
}
class Manager extends Member {
	String department;
	void manager() {
		System.out.println(name +" "+ age +" "+phoneNumber+" "+address+" £"+salary+" "+department);
	}


public static void main(String args []) {
	Employee e = new Employee();
	Manager m = new Manager();
	    e.name = "George Maxwell Dery";
	    e.age = 24;
	    e.phoneNumber = "0545103373";
	    e.address = "KNUST PMB";
	    e.salary = 5000;
	    e.specialization = "Financial Economics";
	    
	    m.name = "Gregory Baffoe Bonnie";
	    m.age = 25;
	    m.phoneNumber = "0501350219";
	    m.address = "FBN PMB, ACCRA";
	    m.salary = 4900;
	    m.department = "IT Dept";
	    //m.specialization = "xyzxyz";
	    e.printSalary();
	    m.printSalary();
	    e.employee();
	    m.manager();
}  
}



