package oops;

/* create a class named members having the following details?
// 1.name 2.age 3.address 4.salary
// it also has a method printdetails which print all the details of members
// classes worker and manager inherits the member class.the worker and manger classaes have data members 
 * specialization and department respectively
 */
// assign values to worker and manger by making an object of both these classes and print the details*/

class Members{
	 String name;
	int age;
	String address;
	int salary;
	

public void printdetails() {
	

System.out.println("name  ="+name);
System.out.println("age ="+age);
System.out.println("address ="+address);
System.out.println("salary ="+salary);
}
}

class Worker extends Members
{
	String specialization;
}
class Manager extends Members
{
	String department;
	
}


public class Ques_inheritance {
	
	public static void main (String [] args) {
		Worker e1=new Worker();
		e1.name="neenu";
		e1.age= 18;
		e1.salary=20000;
		e1.address="aaaaa";
		e1.printdetails();
		e1.specialization="selenium";
		System.out.println("specilaization :"+e1.specialization);
	
		
		Manager e2=new Manager();
		e2.name="appu";
		e2.age=20;
		e2.salary=25000;
		e2.address="astraa";
		e2.printdetails();
		
		e2.department="electronics";
		System.out.println("department :"+e2.department);
		
		
	}
	
}
