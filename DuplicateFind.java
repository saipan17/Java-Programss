public class DuplicateFind
{
	public static void main(String[] args) {

      int arr[] = {4,5,78,12,90,21, 5 , 12, 78};
      
      for(int i = 0; i<arr.length; i++){
          
             for(int j = i+1; j<arr.length; j++){
                 
                 if(arr[i] == arr[j]){
                     
                     System.out.println("The Duplicate Elements are " +arr[i]);
                 }
           }
      }

	}
}