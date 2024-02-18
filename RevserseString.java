public class RevserseString
{
	public static void main(String[] args) {
		
		String str = "ABCDEF";
		
		for(int i = str.length()-1; i>=0; i--){
		    
		       System.out.print(str.charAt(i));
		}
		
		
	}
}