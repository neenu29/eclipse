package oops;

// same name but different arguments


public class Method_overloading {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}

	
	public static void main(String[] args) {
		Method_overloading ov=new Method_overloading();
		ov.add(3,4);
		ov.add(5,6,7);
		
	}
}
