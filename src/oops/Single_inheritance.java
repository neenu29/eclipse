package oops;


class Dog
{
	public void barking()
	{
		System.out.println("dog is barking");
	}
}

class Cat extends Dog
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}


public class Single_inheritance {
 
	public static void main(String[] args) {
		Cat c=new Cat();
		c.barking();
		c.sleeping();
		Dog d=new Dog();
		d.barking();
		
	}
	
	
	
	
	
	
	
}



