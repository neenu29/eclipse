package oops;

public class Finallpgm {
	public static void main(String[] Args)
	{
		System.out.println("started");
		try
		{
			int i=0;
			System.out.println(i/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			
		}
		finally
		{
			System.out.println("this is finally");
		}
		System.out.println("stopped");

}
}

