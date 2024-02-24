import java.util.*;
import java.util.stream.Collectors;

class Employee {
    
     int id;
     String name;
     int salary;
     
     public Employee(int id , String name , int salary){
         
           this.id = id;
           this.name = name;
           this.salary = salary;
     }
}

public class Stream
{
	public static void main(String[] args) {
	    
	    List<Employee>list = new ArrayList<Employee>();
	    
	    list.add(new Employee(1 , "Saipan" , 67000));
	    list.add(new Employee(2 , "Aman" , 55000));
	    list.add(new Employee(3 , "Akash" , 67000));
	    list.add(new Employee(4 , "Abisehk" , 70000));
	    list.add(new Employee(5 , "Sagar" , 90000));
	    
	    List<String>newList = list.stream().filter(x->x.salary > 60000).map(x -> x.name).collect(Collectors.toList());
	    
	    System.out.println(newList);
	    
	
	}
}