package Looping_stmts;

public class While_loop_questions {

public static void main(String[] args) {
	
	//1. print 1 to 10?
	
int i=1;
System.out.println("print 1 to 10 :");
	while(i<=10) 
	{
		System.out.println(i);
		i++;
}
	//2.print odd numbers?
	i=1;
System.out.println("odd numbers is:");
	while(i<=10)
	{
		System.out.println(i);
		i=i+2;
	}
	//3.print odd numbers using %?
	
	i=1;
	System.out.println("odd numbers is:");
		while(i<=10)
		{
		if(i%2!=0)
		{
			System.out.println(i);
		}
		i++;
		
		}

	
}

}
