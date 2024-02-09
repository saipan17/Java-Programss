class Large {

     public int large(int arr[] , int n) {
     
    for(int i = 0; i<n; i++){
       for(int j = i+1; j<n; j++){

         if(arr[i] > arr[j]) {

          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

     }

  }
}
      return arr[n-3];
}
  
}

class ThirdLargeElement{
  public static void main(String[] args) {

   int arr[] = {6,5,4,18,21,89,42,76 ,44};

   int length = arr.length;

   Large l = new Large();

   int element = l.large(arr , length);

   System.out.println("Third large Element is " + element);


}
}