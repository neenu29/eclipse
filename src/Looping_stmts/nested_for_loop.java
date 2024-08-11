package Looping_stmts;

public class nested_for_loop {
	
	//1. print like 
	// * * * *
	// * * * *
	// * * * *

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*  ");
				//System.out.print("i"+i+"j"+j);
			}
			System.out.println();
		}
	}
}

		
		// 2. print like
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		
		/*for(int i=1;i<=5;i++) //++i also possible
		{
			for(int j=1;j<=i;j++)//++j also possible
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 3.print like 
		// 1
		// 1 2
		// 1 2 3 
		// 1 2 3 4
		// 1 2 3 4 5
		
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
				
			}
			System.out.println();
		}
		
		
		// 4.print like 
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		
		int a=1;
		
		for (int i=1;i<=4;i++)
		{
			for (int j =1;j<=i;j++)
			{
				System.out.print(a+ " " );
				a++;
			}
			System.out.println();
		
		/* 5.print like
		  * * * * *
		  * * * *
		  * * *
		  * *
		  *         */
		 /* for(int k=5;k<=5;k++)
		  {
			  for(int j=1;j<=k;j--)
			  {
				  System.out.print("*");
				  
			  }
			  System.out.println();*/
		  }//
		
		
		

	}
}

	

	


