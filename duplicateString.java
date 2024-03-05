import java.util.Scanner;
public class duplicateString
{
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the String");
	
	   String str =  sc.nextLine();
	   
	   String str1 = str.toLowerCase();
	   
	   for(int i = 0; i<str1.length(); i++){
	       
	         for(int j = i+1; j<str1.length(); j++){
	             
	             if(str1.charAt(i) == str1.charAt(j) && str1.charAt(i) != ' '){
	                 
	                System.out.println(str.charAt(j));
	                break;
	             }
	         }
	   }
	}
}