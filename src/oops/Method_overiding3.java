package oops;
// method overoding3

class Car
{
	public void speed() {
		
	}
	public void power() {
		System.out.println("car is power");
		
	}
}


class BMW extends Car
{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("BMW speed");
		super.speed();
	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("BMW power");
		super.power();
	}
	
}
public class Method_overiding3 {
	public static void main(String[] args) {
		BMW S=new BMW();
		S.speed();
		S.power();

}
}
