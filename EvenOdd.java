public class EvenOdd
{
	public static void main(String[] args) {
	
	   int arr[] = {4,6,9,3,8,12,11,21,23,42};
	   
	   System.out.println("Even Numbers");
	   for(int i = 0; i<arr.length; i++){
	       
	         if(arr[i]%2==0){
	             
	             System.out.println(arr[i]);
	         }
	      
	   }
	   
	     System.out.println("Odd Numbers");
	     for(int i = 0; i<arr.length; i++){
	       
	         if(arr[i]%2!=0){
	             
	              System.out.println(arr[i]);
	           
	         }
	   }
	  
	}
}