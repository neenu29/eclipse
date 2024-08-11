package assignment_ques;
import java.util.Scanner;

	public class Reverse_int_array {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("original array:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i] +",");
		}
		
		// reversing array
		System.out.println("reversed  array:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+ " ");
		}
		
		
}




}
