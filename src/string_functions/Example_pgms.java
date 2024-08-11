package string_functions;

public class Example_pgms {
	public static void main(String [] args) {
		// length of string
		String s="welcome";
		// System.out.println(s.length());
		int w=s.length () ;
		System.out.println("length :"+w);
		
		// to join two strings
		
		String s1="hello";
		String s2="Luminar";
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2);
		System.out.println(s1+1+2);
		System.out.println(1+2+s1);
		
	
		String s5="Luminar";
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		System.out.println(s5.startsWith("u"));
		System.out.println(s5.endsWith("a"));
		
		// compare 2 strings
		
		String a="abc";
		String b="Abc";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		
		// System.out.println(a==b);
		
		//to trim white spaces
		
		String q="   hello   ";
		System.out.println(q);
		System.out.println(q.trim());
		
		// to extract a particular portion from the string
		
		String y="welcome";
		System.out.println(y.substring(3));
		System.out.println(y.substring(0,4));
		
		String x="welcome to Luminar";
		System.out.println(x.contains("luminar"));
		System.out.println(x.replace("el", "xy"));
		
		String z="welcome";
		System.out.println(z.charAt(4));
		
		
	
		
		// split()
		
		String w1="welcome to luminar";
		String words[]=w1.split(" ");
		for(String k: words)
		{
			System.out.println(k);
			
		}
		
		//toCharArray
		
		String t="hello";
		char c1[]=t.toCharArray();
		for(char v:c1)
		{
			System.out.println(v);
			
		}

		
		
		
		
		
	}

}
