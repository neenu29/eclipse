package oops;

public class Circle_area_with_pr_with_return {
	public double circ (int r) {
		double area =3.14*r*r;
		return area;
		
	}
	public static void main(String[] args) {
		Circle_area_with_pr_with_return m=new Circle_area_with_pr_with_return();
	
		
		System.out.println("area="+ m.circ(5));
	}
	

}
