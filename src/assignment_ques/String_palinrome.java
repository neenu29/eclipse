package assignment_ques;

import java.util.Scanner;
public class String_palinrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String X =sc.next(); // abcd
	
		String rev="";
		
		String  org_str= X;
		
		int len= X.length();// 4
		System.out.println("length =" +len);
		
		for (int i=len-1;i>=0;i--) // 3 2 1
		{
			rev=rev+X.charAt(i); // dcba
		}
		 System.out.println("reversed string :" + rev);
			
		if(org_str.equals(rev))
		{
			
		
		
		 System.out.println(org_str +" is palindrome string");
		}
		else
		{
			 System.out.println(" string is not palindrome");
		}
}
	
	
	
}
