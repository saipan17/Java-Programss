import java.util.Scanner;
public class Prime
{
	public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the number");
         
         int no = sc.nextInt();
         
         int temp = 0;
         
         for(int i = 2; i<no; i++){
             
             if(no%i==0){
                 
                 temp = temp+1;
             }
         }
         
         if(temp==0){
             
             System.out.println("Number is prime");
         }
         else{
             
             System.out.println("Number is not prime");
         }
	}
}