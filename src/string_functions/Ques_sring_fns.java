package string_functions;

public class Ques_sring_fns {
	public static void main(String[]args) {
		
		//1. java pgm to concatenate given strings?
		//string s= Jmeter
		//string s1= performance testing tool
		
		// answer:
		
		String s="Jmeter ";
		String s1="performance testing tool";
		System.out.println(s.concat(s1));
		
		// 2. input " java language is platform independent" check the string " language " is present in the given string. 
		// if that particular text is present print "pass"?otherwise print "fail".
		
		String s2="java language is platform independent";
		System.out.println(s2.contains("language"));
	if(	true)
	{
		System.out.println("pass");
		
	}
	else
		System.out.println("fail");
	
		
	}
	
	//3.String s3="selenium webdriver is used for webapplication testing" split the above string & print all words .
	//check the string "webapplication " is present ,if it is present stop execution?
	
	
	
	String s3="selenium webdriver is used for webapplication testing";
	String names[]=s3.split(" ");
	for(String x: names)
	{
		System.out.println(x);
		
	}
	

}

}

