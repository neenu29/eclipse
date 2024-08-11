package exam;


interface principal
{
	void resign();
	void rejoin();
}

class Student
{
	 void marks()
	 {
		 System.out.println("marks");  
	 }
	
	
	public void showdetails()
	{
		System.out.println(" showdetails");
	}
}

class Teacher extends Student implements principal
{
	public void department()
	{
		System.out.println(" department");
	}

	@Override
	public void resign() {
	System.out.println("resign");
		
	}

	@Override
	public void rejoin() {
		System.out.println("rejoin");
	}
public class Qu_3 {
	public static void main(String [] args) {
		Teacher t=new Teacher();
		t.department();
		t.rejoin();
		t.resign();
		t.showdetails();
		t.marks();
	}

}
}
