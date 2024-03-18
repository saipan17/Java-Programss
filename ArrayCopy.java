public class ArrayCopy
{
	public static void main(String[] args) {
	
	     
	    int arr[] = {3,2,1,4, 9, 12};
	    
	    int arr1[] = new int[arr.length];
	    
	    arr1 = arr;
	    
	    
	    for(int ele : arr1){
	        
	        System.out.println(ele);
	    }
	}
}