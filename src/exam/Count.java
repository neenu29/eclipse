package exam;

public class Count {
	public static void main(String[] args) {    
        String x = "hello world";    
        int count = 0;    
            
         
        for(int i = 0; i < x.length(); i++) {    
            if(x.charAt(i) != ' ')    
                count++;    
        }    
            
        
    System.out.println(" number of characters in a string: " + count);    
    }    
}     
	


