package oops;
//changing the order of parameters
public class Method_overloading3 {
	public void add(int a,double b) {
		double value =a+b;
		System.out.println(value);
		
	}
    public void add(double a,int b) {
    	double value= a+b;
    	System.out.println(value);
    	
    }
    
    public static void main(String [] args)
    {
    	Method_overloading3 ob = new Method_overloading3();
    	ob.add(5,6.6);
    	ob.add(4.5, 9);
    	
    }
}
