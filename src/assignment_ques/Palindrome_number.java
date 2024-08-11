package assignment_ques;
import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num =sc.nextInt();
		
		int org_num= num;
		int rev=0,r;
		while(num!=0)
			
		{
			r=num%10;   // 
			rev=(rev*10)+r; // 
			
			num=num/10;//  121/10=12   12/10=1   1/10=0 
		}  
		System.out.println("reverse of number is:"+rev);
		
		if(org_num==rev)
		{
			System.out.println(org_num +"  is palindrome ");
			
		}
		else {
			System.out.println(org_num +"  is not  palindrome ");
		}
		
		
}
}

