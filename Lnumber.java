import java.util.Scanner;

class Lnumber {
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the first Number");
       
       int no1 = sc.nextInt();
       
        System.out.println("Enter the second Number");
       
       int no2 = sc.nextInt();
       
        System.out.println("Enter the third Number");
       
       int no3 = sc.nextInt();
      
       int temp = no1>no2?no1:no2;
       
       int large = temp>no3?temp:no3;
       
       System.out.println("The largest number is " +large);
}
}