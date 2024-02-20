class ArmstrongNumber {
  public static void main(String[] args){

     int no = 153;

     int length = 0;

     int temp1 = no;

     while(temp1 != 0){
    
      
       length = length + 1;
       temp1 = temp1/10;

    }

    int temp2 = no;
    int arm = 0;
    while(temp2!=0){

    int rem = temp2 % 10;


    int len = 1;
    for(int i = 1; i<=length; i++){
  
    len = len*rem;

}
  arm = arm + len;
  temp2 = temp2/10;
  
}

if(arm==no){
     
     System.out.println("Armstrong Number");
}

else{
   
   System.out.println("No Armstorng Number");
}

}
}

 