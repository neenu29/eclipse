package string_functions;

public class Quess {
	public static void main(String [] args) {
		
	
	
	//3.String s3="selenium webdriver is used for webapplication testing" split the above string & print all words .
		//check the string "webapplication " is present ,if it is present stop execution?
		
		
		
		String s3="selenium webdriver is used for webapplication testing";
		 String a[]=s3.split(" ");
	/*	for(String x: a)
		{
			System.out.println(x);
			
		}*/
		for(String s1:a)
		{
			System.out.println(s1);
			if(s1.contains("webapplication"))
			{
				break;
			}
		}
	
		

}
}
