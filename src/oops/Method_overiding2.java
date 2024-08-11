package oops;
//2 method overiding2
class parent
{
	

//String name="abc";

public void  phone()
{
	System.out.println("nokia");
}
}
class child extends parent
{
	public void phone()
	{
//	System.out.println(super.name);
		super.phone();
		System.out.println("phone");
	}
}


public class Method_overiding2 {
	
	public static void main(String[] args) {
		child c=new child();
		c.phone();
	}
	
	
	
	
	
	
	
	

}
