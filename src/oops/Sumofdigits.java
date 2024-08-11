package oops;

public class Sumofdigits {
	public static void main(String[] args) {
	
	int n=4567;
	int sum =0;
	int temp;
	while(n>0)
	{
		temp=n%10;
		sum=sum+temp;
		n=n/10;
	}
	System.out.println("sum ="+sum);
	}
}
