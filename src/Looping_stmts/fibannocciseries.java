package Looping_stmts;

public class fibannocciseries {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
	//	int N=10;
		System.out.println("fibannoci series is" );
		for(int i=1;i<=10;i++)
		{
			System.out.print(a+" ");
			
			// swap
			int c=a+b;
			a=b;
			b=c;
		}
	}
 
}
