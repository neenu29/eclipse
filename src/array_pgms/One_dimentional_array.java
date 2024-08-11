 
 package array_pgms;
 
 import java.util.Scanner;

 

public class One_dimentional_array {
	
	public static void main(String[] args) {
		int a[]=new int[6]; // declare 
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your numbers");
        
        for (int i=0;i<6;i++)// i- index no// to read numbers 
        {
        	a[i]=sc.nextInt();//store values to array
        }
        System.out.println("entered numbers are");
        for (int i=0;i<6;i++)
        {
        	System.out.println(a[i]);
        	
        }
	}

}
