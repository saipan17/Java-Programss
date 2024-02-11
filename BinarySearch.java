class Binary {
    
      public int binary(int arr[] , int target){
          int min = 0;
          int max = arr.length-1;
          
          while(min<=max){
             
              int mid = (min+max)/2;
          
              if(arr[mid]==target){
                  
                  return mid;
              }
              else if(arr[mid]<target){
                  
                   min = mid+1;
              }else{
                 
                 max = mid-1; 
       
              }   
          }
          return -1;  
      }
}

class BinarySearch {
    public static void main(String[] args) {
      
      int arr[] = {3,5,7,9,12,45,78,90};
      
      int target = 9;
      
      int n  = arr.length;
      
      Binary b = new Binary();
      
      int result = b.binary(arr , target);
      
      if(result == -1){
          
          System.out.println("The element is not present in the array");
      }
      else{
         
      System.out.println("The element is present at index " +result);
      
      }
     
    }
}