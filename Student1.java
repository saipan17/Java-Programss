import java.util.*;
import java.util.stream.Collectors;

class Student {
    
    int id;
    String name;
    int marks;
    
    public Student(int id , String name , int marks){
        
          this.id = id;
          this.name = name;
          this.marks = marks;
    }
}

public class Student1
{
	public static void main(String[] args) {
	    
       Student s1 = new Student(1 , "saipan" , 45);
       Student s2 = new Student(2 , "Virat" , 87);
       Student s3 = new Student(3, "Rohit" , 98);
       Student s4 = new Student(4, "Gyle" , 99);
	    
	   List<Student> list = new ArrayList<Student>();
	   
	   list.add(s1);
	   list.add(s2);
	   list.add(s3);
	   list.add(s4);
	   
	   List<String> newlist = list.stream().filter((n) -> n.marks >= 80).map(x->x.name).collect(Collectors.toList());
	   
	   newlist.forEach((x) -> System.out.println(x));
	                       
	}
}