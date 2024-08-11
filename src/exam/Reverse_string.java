package exam;

import java.util.Scanner;

public class Reverse_string {
		public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a string:");
			
				String X =sc.next(); 
				
				String rev="";
						
				char a[]=X.toCharArray();
				
				int len =X.length();
				for(int i=len-1;i>=0;i--)
				{
					rev=rev+a[i];
				}
				
				 System.out.println("reversed string :" + rev);
				
				
				
		}
		}




