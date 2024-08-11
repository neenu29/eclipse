package Looping_stmts;

public class For_loop_stmnts_questions {

	
	//1.print 1 to 10 ?
	
	public static void main(String[] args) {
	
	int i;
	System.out.println("print 1 to 10:");
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
			
		}
		
	//2.print 10 to 1?
	
	
	System.out.println("print 10 to 1");
	for(i=10;i>0;i--)
	{
		System.out.println(i);
	}
	
	// 3.print sum of natural numbers 1 to 100?

	int s=0;
	
	for(i=1;i<=100;i++)
	{
		s+=i;
	
	
	System.out.println("sum of natural numbers="+s);
	}
	
	//4.print multipication table of 5 upto 10 numbers?
	
	

	 System.out.println("multiplication table :");
	for(i=1;i<=10;i++)
	{

		System.out.println(i+"*5="+i*5);
	}
	
	
	
	
	
	
}

}