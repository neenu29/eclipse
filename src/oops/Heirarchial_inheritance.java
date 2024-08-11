package oops;
class DogB
{
	public void barking()
	{
		System.out.println("dog is barking");
	}
}

class CatB extends DogB
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}

class Lionc extends DogB
{
	public void running()
	{
		System.out.println("lion is running");
	}
}
public class Heirarchial_inheritance {
public static void main(String[] args) {
		
	CatB a=new CatB();
	Lionc n=new Lionc();
	a.barking();
	a.sleeping();
	n.running();
	n.barking();
		
	}
}
