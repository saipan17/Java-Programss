public class SumArray
{
	public static void main(String[] args) {
	    
	    int arr[] = {5,4,12,45,32,9,21};
	    
	    int sum = 0;
	    
	    for(int i = 0; i<arr.length; i++){
	        
	        sum = sum + arr[i];
	    }
	    
	    System.out.println(sum);
	}
}