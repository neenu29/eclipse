package assignment_ques;
import java.util.Scanner;

public class Matix_addition {
	public static void main(String[] args) {
		
	int r,c;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number of rows:");
	 r=sc.nextInt();
	System.out.println("Enter number of colums:");
	c=sc.nextInt();
	int A[][]=new int[r][c];
	int B[][]=new int[r][c];
	int C[][]=new int[r][c];
	System.out.println("Enter the elements of matrix  A:");
	for (int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			A[i][j]=sc.nextInt();
			
		}
	}
	
	System.out.println("Enter the elements of matrix B:");
	
	for (int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			B[i][j]=sc.nextInt();
			
		}
	}
	

	System.out.println("sum of  matrix A AND B:");
	
	for (int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			C[i][j]=A[i][j]+B[i][j];
			
		}
	}
	for (int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(C[i][j] +  " ");
			
		}
		

		System.out.println( );
	}


}
}

