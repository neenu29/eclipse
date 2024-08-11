package controlstatements;

public class Largest_of_three_numbers_else_if {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		int c=10;
		if(a>b && a>c)
		{
			System.out.println("largest is a");
		} 
		else if(b>a && b>c)
		{
			System.out.println("largest is b");
			
		}
		else
		{
			System.out.println("largest is c");
			
		}
	}
}
