package assignment_ques;
import java.util.Scanner;

public class Reverse_string {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
	
		String X =sc.next(); // abcd
		//String X="neenu";
		String rev="";
				 
		
		/*int len= X.length();// 4
		System.out.println("length =" +len);
		
		for (int i=len-1;i>=0;i--) // 3 2 1
		{
			rev=rev+X.charAt(i); // dcba
		}*/
		
		
		// using character array
		
		char a[]=X.toCharArray();
		
		int len =X.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		 System.out.println("reversed string :" + rev);
		
		
		
}
}

