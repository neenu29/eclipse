package controlstatements;
 import java.util.Scanner;
public class ano_calc_switch {
  public static void  main (String[] args) {
	 
	  Scanner sc=new Scanner(System.in);
	  int a,b,c,operator;
	  
	  System.out.println("enter first number");
	   a=sc.nextInt();
	  
	   System.out.println("enter second number");
	   b=sc.nextInt()
;
	   System.out.println("enter your operator");
	   System.out.println("1.addition" + "2.substraction"+ "3.multiplication" + " 4.division");
	   operator=sc.nextInt();
	   switch (operator)
	   {
	   case 1:
		   c=a+b;
		   System.out.println(a+ "+" +b +"="+c);
		   break;
		   
	   case 2:
		   c=a-b;
		   System.out.println(a+ "-" +b +"="+c);
		   break;
	   case 3:
		   c=a*b;
		   System.out.println(a+ "*" +b +"="+c);
		   break;
	   case 4:
		   c=a/b;
		   System.out.println(a+ "/" +b +"="+c);
		   break;
		   
		   default:
			   System.out.println("invalid input");
			   
		   
	   }
	   
	  
  }
}
