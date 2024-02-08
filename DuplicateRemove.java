//Q. WAP for Removal of duplicate elements from an array
// By using HashSet i have remove the duplicate elements from an array.

import java.util.*;

public class DuplicateRemove {
  public static void main(String[] args) {

    int arr[] = {4,7,9,4,2,12,7,2};

    Set<Integer> set = new HashSet<Integer>();

   for(int ele : arr) {

         set.add(ele);
   }

  int wihoutDuplicatArrray[] = new int[set.size()];

  int cnt = 0;

  for(int elements : set) {

     wihoutDuplicatArrray[cnt] = elements;
     cnt++;
  }


for(int uniquelement : wihoutDuplicatArrray ) {

      System.out.println(uniquelement);

 }
   
}
}