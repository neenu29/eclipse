package oops;

public class Count_while_loop {
	
	public static void main(String[] args) {
		
		int count =0;
		 int n =1234;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("number of digits ="+ count);
	}

}
