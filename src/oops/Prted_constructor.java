package oops;

public class Prted_constructor {

	int empid;
	int salary;
	String designation;



public void Prted_constructor(int empid,int salary,String designation) 
	

	

{
	
	this.empid=empid;
	this.salary=salary;
	this.designation=designation;
	
}
  /* public Prted_constructor(int id,int sal,String desig)   {
  empid=id;
  salary=sal;
 designation=desig;
  
}*/
   
 
	public static void main(String[] args) {
	
		Prted_constructor ob1= new Prted_constructor();
		ob1.designation="developer";
		ob1.salary= 30000;
		ob1.empid=101;
		
		System.out.println(ob1.empid);
		System.out.println(ob1.salary);
		System.out.println(ob1.designation);
	}
}
 
