package controlstatements;

import java.util.Scanner;

public class calculator_switch {
	public static void main(String[] args) {
	
		char operator;
		Double n1,n2,n3;
	Scanner sc=new Scanner(System.in);
	System.out.println("choose an operator: +,-,*,or /");
	operator=sc.next().charAt(0);
	System.out.println("enter first number");
	n1= sc.nextDouble();
	 System.out.println("enter second number");
	 
	 n2 = sc.nextDouble();
	
 switch(operator) {
	 
	 case '+':
		 n3=n1+n2;
	 System.out.println(n1 +" + " + n2 + "=" + n3);
		  
		 break;
		 
	 case '-':
		 n3=n1-n2;
		 System.out.println(n1 +" - " + n2 + "=" + n3);
		
		 break;
	 case '*':
		 n3=n1*n2;
		 System.out.println(n1 +" * " + n2 + "=" + n3);
		 
		 break;
	 case '/':
		 n3=n1/n2;
		 System.out.println(n1 +" / " + n2 + "=" + n3);
	  
	    break;
	 default:
			
			System.out.println("invalid operator");
			break;
			
	 }
	 
	}

}
