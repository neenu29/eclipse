package basics;

public class Vowelscount {
	public static void main (String [] args)
	{
		String s= "HELLO world";
		s=s.toLowerCase();
		int count=0;
		int len=s.length();
		for(int i=0;i<len;i++ )
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("count of vowels=" + count);
	}

}
