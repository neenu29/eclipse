package assignment_ques;
import java.util.Scanner;


public class Reverse_num {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num =sc.nextInt();
		
		//1.using algorithm 
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10; // 0+1234%10=4     4*10+ 123%10=40+3=43     43*10+12%10 =430+2=432  432*10+1%10= 4320+1=4321
			num=num/10;//  1234/10=123   123/10=12    12/10=1   1/10=0
		}  
		
		System.out.println("reversed number :" + rev);
		

}
}

