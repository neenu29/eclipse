package oops;
//same name different datatypes
public class Method_overloading2 
{

	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
}
	public void add(int a,double b)
	{
		double value = a+b;
		System.out.println(value);
		
	}
	
	public static void main(String[] args) {
		Method_overloading2 ob=new Method_overloading2();
		ob.add(3,4);
		ob.add(5,6.6);
		
}
}
