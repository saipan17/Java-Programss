import java.util.Scanner;
public class Smallest
{
	public static void main(String[] args) {
		
		
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the first Number");
	  int no1 = sc.nextInt();
	  
	  System.out.println("Enter the Second Number");
	  int no2 = sc.nextInt();
	  
	  System.out.println("Enter the Third Number");
	  int no3 = sc.nextInt();
	  
	  int temp = no1<no2 ? no1 : no2;
	  
	  int small = temp<no3 ? temp : no3;
	  
	  System.out.println("The smallest Number among three number is " + small);
	  
	  
	  
	}
}