package exam;



public class Question_4
{
	int rollnumber;
	String name;
	int marks;
	

	public void store(int roll,String nam,int mark)
	{
	rollnumber=roll;
	name=nam;
	marks=mark;
	}

	public void display() {
		

	System.out.println("rollnumber ="+rollnumber);
	System.out.println("name ="+name);
	System.out.println("marks ="+marks);
		
	}

	public static void main(String[] args) {
		Question_4 ob=new Question_4();
		ob.store(10, "neenu", 90);
		ob.display();
	}

	

	
}







