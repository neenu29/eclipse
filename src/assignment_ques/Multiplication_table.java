package assignment_ques;
import java.util.Scanner;

public class Multiplication_table {
public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number for multiplication:");
	int n =sc.nextInt();
	int num=0;
	System.out.println("multiplication table is :");
	for (int i=1;i<=10;i++)
	{
		System.out.println(n + " * " + i +" = " + (n*i ));
	}
	
}
}
