package oops;

public class Area_triangle_without_pr_with_return {
	public double triangle ()
	{
		int b=20;
		int h=12;
		double area=0.5*b*h;
		return area;
		
	}
	public static void main(String [] args) {
		Area_triangle_without_pr_with_return p = new Area_triangle_without_pr_with_return();
		p.triangle();
		System.out.println("area ="+p.triangle() );
		
	}
}
