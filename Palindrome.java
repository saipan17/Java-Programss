import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
       
      System.out.println("Enter the number");
       
      int no = sc.nextInt();
      
      int temp = no;
      int rev = 0;
      
      while(temp!=0){
          
          int rem = temp%10;
          rev = rev*10 + rem;
          temp = temp/10;
          
      }
        
      if(no==rev){
          
          System.out.println(no + " is Palindrome number");
      }
      else{
          
          System.out.println(no + " is not palindrome number");
      }
	}
}
