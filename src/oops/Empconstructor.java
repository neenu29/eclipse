package oops;
// default constructor
public class Empconstructor {
// define instance variables
	int empid;
	int salary;
	String designation;
	
	public Empconstructor()
	{
		 empid=1;
		  salary=30000;
		 designation="tester";
		  
	}
	public static void main(String[] args) {
		Empconstructor emp=new Empconstructor();
		
		System.out.println(emp.empid);
		System.out.println(emp.salary);
		System.out.println(emp.designation);
	}
	
}
