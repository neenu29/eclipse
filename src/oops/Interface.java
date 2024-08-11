package oops;

interface Whatsappcalls
{
	int a=10;
	void calls();
	void mute();
	void disconnect();
}

class Audiocalls implements Whatsappcalls
{

	@Override
	public void calls() {
		// TODO Auto-generated method stub
		System.out.println("whatsappcalls");
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("whatsappcalls is muted");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("whatsappcalls disconnected");
	}
	
}

class Videocalls implements Whatsappcalls
{

	@Override
	public void calls() {
		// TODO Auto-generated method stub
		System.out.println("videocalls");
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("videocalls muted");
	}
	

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("videocalls diconnected");
	}
	}
	


public class Interface {
	public static void main(String[] args)
	{
		/* Audiocalls a=new Audiocalls();
		 * a.calls();
		 * a.disconnect();
		 * a.mute();
		 * Videocalls v=new Videocalls();
		 * v.calls();
		 * v.disconnect();
		 * v.mute();
		 */
		
		Whatsappcalls ob=new Audiocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		ob=new Videocalls();
		ob.mute();
		ob.calls();
		ob.disconnect();
		System.out.println(Whatsappcalls.a);
		// System.out.println(Whatsappcalls.a=20);
		
	}
	

}
