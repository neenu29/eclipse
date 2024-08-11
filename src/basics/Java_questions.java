package basics;

public class Java_questions {
	
// 1.input 20 to the variable time after that check whether time less than 18 if the condition is true print it is a good day 
	// else print good evening?
	
public static void main(String[] args) {
	int time =20;
	System.out.println(time<18);
	if(time<18)
	{
		
	   System.out.println(" it is a good day");
	}
	   else
	   {
		   System.out.println("good evening");
	   }
	
	// 2.swap 2 numbers using third variable?
	 
	int num1=10;
	int num2=20;
	
	System.out.println("before swapping:");
	System.out.println("num1="+num1);
	System.out.println("num2="+num2);
	
	int temp=num1;
	num1=num2;
	num2=temp;
	
	System.out.println("after swapping");
	System.out.println("num1="+num1);
	System.out.println("num2="+num2);
	
	//3.swap 2 numbers without using temporary variable?
	
	int x=20;
	int y=30;
	
	System.out.println("before swapping:");
	System.out.println("x="+x);
	System.out.println("y="+y);
	
	x=x+y;//20+30=50
	y=x-y;//50-30=20
	x=x-y;//50-20=30
	

	
	System.out.println("after swapping");
	System.out.println("x="+x);
	System.out.println("y="+y);
	
	//4.write a pgm to check whether number is even or odd?
	
	int k=11;
			
			if(k%2==0)
			{
				System.out.println("even number");
				
			}
			else
			{
				System.out.println("odd number");
			}
	//5.
	

}

}
