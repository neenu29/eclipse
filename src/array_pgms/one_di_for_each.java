package array_pgms;

import java.util.Scanner;

public class one_di_for_each {
	
	public static void main(String[] args) {
		String arr[]=new String[4];
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter ur name");
	    for(int i=0;i<4;i++)
	    {
	    	arr[i]=sc.next();
	    	
	    }
	    System.out.println("names are");
	    for(String s:arr)//for (datatype tempvariable:array name)
	    {
	    	
	    
	    	System.out.println(s);
	    
	    }
 
}
}
