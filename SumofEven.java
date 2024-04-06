import java.util.Arrays;
import java.util.List;

public class SumofEven
{
	public static void main(String[] args) {
	
	   List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	   
	   int sum  = numbers.stream().filter(x -> x%2==0).mapToInt(Integer::intValue).sum();
	                          
      System.out.println("Sum of Even integers numbers is " + sum);
	}
}