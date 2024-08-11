package oops;
class DogA
{
	public void barking()
	{
		System.out.println("dog is barking");
	}
}

class CatA extends DogA
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}

class Lion extends CatA
{
	public void running()
	{
		System.out.println("lion is running");
	}
}

public class Multilevel_inheritence {
	
	public static void main(String[] args) {
		
		Lion l=new Lion();
		l.barking();
		l.running();
		l.sleeping();
		
		
	}
	
	
}
