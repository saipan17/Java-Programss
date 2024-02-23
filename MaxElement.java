public class MaxElement
{
	public static void main(String[] args) {
	
	    int arr[] = {4,7,8,12,1,3,9 ,23};
	    
	    int max = arr[0];
	    
	    for(int i = 1; i<arr.length; i++){
	        
	          if(arr[i]>max){
	              
	              max = arr[i];
	          }
	    }
	    
	    System.out.println(max);
	}
}