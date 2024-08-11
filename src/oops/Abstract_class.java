package oops;

abstract class Google
{
	 static int a=30;
	abstract void message();
	public void search()
	{
		System.out.println("search details ");
	}
}


class SearchAll extends Google 
{

	@Override
	void message() {
		// TODO Auto-generated method stub
		 System.out.println("search all results");
		 
	}
	
}


class SearchImage extends Google
{

	@Override
	void message() {
		// TODO Auto-generated method stub
		
	System.out.println("search all images");
		
	}
	
}

class SearchVideo extends Google
{

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("search all videos");
	}
	
}
public class Abstract_class {

	public static void main(String [] args) {
		
		
		SearchAll s=new SearchAll();
		s.message();
		
		
		
	}
	
	
}
