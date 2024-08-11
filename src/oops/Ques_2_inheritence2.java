package oops;
// creaTE A CLSS monkey with jump and bite methods, create a class human with speak method 
//which inherits this mpnkey class and implements basic aniamal interface with cat and sleepy methods?
interface basicanimal
{
	void cat();
	void sleep();
}

class Monkey
{
	 void jump()
	 {
		 System.out.println("jump");  
	 }
	
	
	public void bite()
	{
		System.out.println("  bite");
	}
}

class Human extends Monkey implements basicanimal
{
	public void speak()
	{
		System.out.println("  speak");
	}
	
		
		

			@Override
			public void cat() {
				// TODO Auto-generated method stub
			
				
					System.out.println("cat");
			}

			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("sleep");
			}
			
		
	}






public class Ques_2_inheritence2 {
	public static void main(String [] args) {
		Human h=new Human();
		h.bite();
		h.cat();
		h.jump();
		h.sleep();
		h.speak();
		
		
	}

}
