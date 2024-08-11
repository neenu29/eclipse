package basics;

public class Questions {
	
	
	// 1.write a pgm to check if the 2 numbers 23 and 45 are equal?
	
	public static void main(String[] args) {
		int a=23;
		int b=45;
		System.out.println(a==b);
		
		// 2.Assign values of variables A&B as 55 & 70 respectively & then check both conditions A<50 & A<B ARE TRUE?
		
		int c=55;
		int d=45;
		System.out.println(c<50 && c<d);
		
		//3.c=17,print second digit?
		int f=17;
		System.out.println(f%10);		
		
		//4.c=243 ,print second digit?
		int t=243;
		System.out.println((t%100)/10);
		
		//5.print last digit of above number?
		System.out.println((t%100)%10);
		
		//6.area of rectangle?
		int l=12;
		int h=14;
		int area=l*h;
		System.out.println("area of rectangle="+area);
		
		//7.area of square?
		int s=13;
		int areas=s*s;
		System.out.println("area of square="+areas);
		
		
	}
	
	
	
	
	
	

}
