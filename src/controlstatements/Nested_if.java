package controlstatements;

public class Nested_if {

	public static void main(String[] args)
	{
		int age=19,weight=40;
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("eligible");
				
			}
			else
			{
				System.out.println("ineligible:under weight");
				
			}
		}
		else
		{
			System.out.println("not eligible");
		}
	}
	
}
