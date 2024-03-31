import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenSquare
{
	public static void main(String[] args) {
	
	   List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	   
	   List<Integer> evensquare =  list.stream().map(n->n*n).filter(n -> n%2==0).collect(Collectors.toList());
	   
	   for(int ele : evensquare){
	       
	       System.out.println(ele);
	   }
	}
}
