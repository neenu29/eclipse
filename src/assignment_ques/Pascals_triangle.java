package assignment_ques;

public class Pascals_triangle {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) // i=0
		{
			// spaces 
			for(int j=1;j<=5-1;j++)
			{
				System.out.print(" ");// 4 , 3, 2, 1, 0
			}
			
			// numbers
			
			int number =1;
			
			for(int k=0;k<=i;k++) {
				System.out.print(number +"  ");
				number = number*(i-k)/(k+1);
			}
			
			System.out.println();
			
		}
		
		
		
		
	}
}


		