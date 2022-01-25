package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class SortExample 
{
 public static void main(String[] args)
 {
	 Integer arr[]= {12,30,18,20,17};
	 String arr1[] = {"Hi","First","who"};
	 //int arr2[]= {20,30,40,10};
	 Arrays.sort(arr1,Collections.reverseOrder());
	 Arrays.sort(arr,Collections.reverseOrder());
	 System.out.print("Number sorted in reverse using array: ");
	 for (int newArr :arr)
	 {
	   System.out.print(newArr+" ");
	 }
	 System.out.println("String sorted in reverse: "+Arrays.asList(arr1));
	// Collections.reverse(Arrays.asList(arr2));
	 //System.out.println("Number sorted in reverse using int type: "+Arrays.asList(arr2));
	 ArrayList<String> list= new ArrayList<String>();
     list.add("Hi");
     list.add("Bye");
     list.add("Am");
     list.add("I");
     list.add("done");
     Collections.sort(list);
     System.out.println("List after sort :\n" + list);
     ArrayList<Integer> list1= new ArrayList<Integer>();
     list1.add(10);
     list1.add(29);
     list1.add(45);
     list1.add(2);
     list1.add(8);
     Collections.sort(list1);
     System.out.println("List after sort in integer:\n" + list1);
     Collections.reverse(list1);
     Collections.sort(list1,Collections.reverseOrder());
     System.out.println("In reverse order: "+list1);
   }
}
