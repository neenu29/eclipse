package oops;

public class Employee_java {
	
	int Empid;
	String Empname;
	String Designation;
	int Deptno;
	


public void  display()
{
	System.out.println(Empid);
	System.out.println(Empname);
	System.out.println(Designation);
	System.out.println(Deptno);
	
}

public static void main(String[] args) {
	
	Employee_java Emp=new Employee_java();
	Emp.Empid=101;
	Emp.Empname="neenu";
	Emp.Designation="tester";
	Emp.Deptno=1;
	Emp.display();
	
	
	
}
}
