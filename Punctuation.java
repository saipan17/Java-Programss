public class Punctuation 
{
	public static void main(String[] args) {
		
		String str = "Hello, How are you? i am fine ! how about you? i am also fine!";
		
		int count = 0;
		
		for(int i = 0; i<str.length(); i++){
		    
		    if(str.charAt(i)== ',' || str.charAt(i) == '?' || str.charAt(i) == '!'){
		        
		        count++;
		        
		      System.out.println(str.charAt(i));
		    }
		}
		
		System.out.println(count);
	}
}