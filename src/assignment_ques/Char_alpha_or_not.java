package assignment_ques;
import java.util.Scanner;

public class Char_alpha_or_not {
public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a character:");
	char c =sc.next().charAt(0);
	
	if((c>= 'a'&& c<= 'z') ||(c>= 'A' && c<= 'Z'))
	{
		System.out.println(c +" is alphabet");
	}
	else
	{
		System.out.println( c +"is not alphabet");
	}
}
}

