package oops;

public class Without_pr_with_return {
	public int mul()
	{
		int a=25;
		int b=2;
		int c=a*b;
		return c;
		
	}
	public static void main(String[]args) {
		
		Without_pr_with_return s = new Without_pr_with_return();
		s.mul();
		
		System.out.println("result ="+s.mul() );
		
		
	}

}
