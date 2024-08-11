package controlstatements;
public class no_scan_calc {
	public static void  main (String[] args) {
		  int a=60;
		  int b=20;
		  int c;
		  int operator =1;
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


