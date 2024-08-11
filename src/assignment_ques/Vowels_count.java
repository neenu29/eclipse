package assignment_ques;


public class Vowels_count {
public static void main(String[] args) {
		
		
		String X ="hello World";
		X=X.toLowerCase();
		int vowels=0;
		int len=X.length();
	
		for(int i=0;i<=len;i++)
		{
			if(X.charAt(i)=='a'|| X.charAt(i)=='e'|| X.charAt(i)=='i'||X.charAt(i)=='o'||X.charAt(i)=='u')
		


{
	vowels++;
}

}
		System.out.println("count of vowels ="+vowels);
}

}

