class ArrayDesOrder {
    public static void main(String[] args) {
       
       
          int arr[] = {4,6,89,10,23,12};
          
          for(int i = 0; i<arr.length; i++){
              
               for(int j = i+1; j<arr.length; j++){
                   
                      if(arr[i]<arr[j]){
                          
                           int temp = arr[i];
                           arr[i] = arr[j];
                           arr[j] = temp;
                      }
                      
               }
          }
          
          for(int elements : arr){
              
              System.out.println(elements);
          }
    }
}