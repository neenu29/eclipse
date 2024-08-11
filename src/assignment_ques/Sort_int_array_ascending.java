package assignment_ques;
import java.util.Scanner;
public class Sort_int_array_ascending {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size =sc.nextInt();
		int a[]=new int[size];
		int temp=0;
		System.out.println("enter elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("inserted elements are:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
// sorting array
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[j]<a[i])
				 {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		 }
}
         System.out.println();
	 System.out.println("Ascending order " );
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print (a[i]+ " ");
		 }
		 
		 

}
}

