package oops;

public class Rectagle_area_with_pr_without_return {
	
	public void rectangle(int l,int b)
	{
		int area = l*b;
		System.out.println("area =" + area);
		
	}
	public static void main (String [] args) {
		Rectagle_area_with_pr_without_return v = new Rectagle_area_with_pr_without_return();
		v.rectangle(20,30);
		
	}

}
