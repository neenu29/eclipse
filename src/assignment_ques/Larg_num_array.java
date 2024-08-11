package assignment_ques;
import java.util.Scanner;
public class Larg_num_array {

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
		System.out.println("inserted elements are:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i] +",");
		}
		
// a[] ={23,45,56,67,54,67};
		
		int max=a[0];
		int min =a[0];
		for (int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
			
		/*	if(min>a[i])
			{
				min=a[i];
			}*/
		}
		System.out.println();
		System.out.println("largest element in array is :" + max);
	//	System.out.println("smallest element in array is :" + min);

}
}
