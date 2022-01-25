package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortObjectExamples
{
	public static void main(String[] args)
	 {
		ArrayList<StudentDetails> list= new ArrayList<StudentDetails>();
		list.add(new StudentDetails(5,"Shakthi"));
		list.add(new StudentDetails(4,"Prabu"));
		list.add(new StudentDetails(3,"Niki") );
		list.add(new StudentDetails(1,"Ajusha"));
		 Collections.sort(list);
	        System.out.println("after sorting : ");
	        for (StudentDetails student: list)
	        {
	          System.out.println(student);
	        }
	 }
}
