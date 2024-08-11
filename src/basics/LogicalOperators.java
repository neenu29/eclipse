package basics;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		/* A     B       A&&B        A||B     !A
		   1     1         1           1       0
		   1     0         1           1       0
	       0     1         1           1       1
           0     0         0           0       1  */
		
		boolean X=true;
		boolean Y=false;
		
		System.out.println(X&&Y);
		System.out.println(X||Y);
		System.out.println(!X);
		System.out.println(!Y);
		
	/*	String username="abc";
		String password="abcd3";
		System.out.println(username=="abc" && password=="abcd3" );
		System.out.println(username=="abc" || password=="abcd" );
		System.out.println(!(username=="abc") );*/
		
		
		
	}
	
}
