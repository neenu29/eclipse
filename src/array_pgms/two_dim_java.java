package array_pgms;
import java.util.Scanner;
public class two_dim_java {
	public static void main(String[] args) {
		int  ar[][]=new int [2][3];
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter values");
	    for(int i=0;i<2;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		ar[i][j]=sc.nextInt ();
	    		

	    		}
	    }
System.out.println("enterd values are");
for(int a[]: ar)
{
	for(int v : a)
	{
		System.out.print(v + " ");
	}
	System.out.println();
	}
	}

}
