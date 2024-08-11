package oops;
 
 interface Bank1
 {
	 void deposit();
	 void withdraw();
	 
 }
 interface Bank2
 {
	 void interestrate();
	 void balancedetails();
	 
 }
 
 class ICICI implements Bank1,Bank2
 {

	@Override
	public void interestrate() {
		// TODO Auto-generated method stub
		System.out.println("interest rate");
	}
	

	@Override
	public void balancedetails() {
		// TODO Auto-generated method stub
		System.out.println("balance details");
	}
	

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposits");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw");
	}
	 
 }
public class Multiple_inheritance {
	
	public static void main(String [] args)
	{
		ICICI OB=new ICICI();
		OB.balancedetails();
		OB.deposit();
		OB.withdraw();
		OB.interestrate();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
