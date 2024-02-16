import java.util.*;


class Employee{

   int id;
   String name;
   int salary;

   public Employee(int id , String name, int salary) {

     this.id = id;
     this.name = name;
     this.salary = salary;

   }
}

class ListOrdering {
  public static void main(String[] args){
  
  List<Employee> list = new ArrayList<Employee>();


  list.add(new Employee(1 , "virat" , 45000));
  list.add(new Employee(2 , "Rohit" , 40000));
  list.add(new Employee(3 , "Ketan" , 67450));
  list.add(new Employee(4 , "saipan" , 98000));

  Collections.sort(list , (e1 , e2) -> {

        return e1.salary > e2.salary ? 1 : -1;

    });

 for(Employee e : list) {

   System.out.println(e.id + " " + e.name + " " + e.salary);
 }
 
}
}