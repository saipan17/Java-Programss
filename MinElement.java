public class MinElement
{
	public static void main(String[] args) {
	
	    int arr[] = {4,7,8,12,1,3,9 ,23};
	    
	    int min = arr[0];
	    
	    for(int i = 1; i<arr.length; i++){
	        
	          if(arr[i]<min){
	              
	              min = arr[i];
	          }
	    }
	    
	    System.out.println(min);
	}
}