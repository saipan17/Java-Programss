public class Vowels
{
	public static void main(String[] args) {
	
	    String str1 = "Hello how are you ? I am fine";
	    
	    String str =  str1.toLowerCase();
	    
	    int count = 0;
	    for(int i = 0; i<str.length(); i++){
	        
	        if((str.charAt(i) == 'a'  ||  str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i)  == 'o' || str.charAt(i) == 'u')){
	            
	            count = count + 1;
	        }
	    }
	  System.out.println("Total Number of Vowels in the String are " + count);
	}
}
