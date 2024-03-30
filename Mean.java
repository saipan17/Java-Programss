interface lambda{
    
    int mean(int a,  int b);
    
}
public class Mean
{
	public static void main(String[] args) {
	
	   lambda l1 = (a , b) -> {
	       
	       return (a+b)/2;
	   };
	   
	   int res = l1.mean(4, 8);
	   
	   System.out.println(res);
	    
	}
}