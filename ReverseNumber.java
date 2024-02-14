import java.util.Scanner;
class ReverseNumber {
 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 System.out.println("Enter the Number");

 int no = sc.nextInt();

 int temp = no;
 int rev = 0; 

 while(temp!=0){
 
 int rem = temp%10;
 rev = rev*10+rem;
 temp = temp/10;

}
System.out.println("The Reverse Number is " +rev);


}
}