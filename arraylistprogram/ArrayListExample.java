package arraylistprogram;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
	public static void main(String[] args)
	{
	 int startNumber,lastNumber;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the start element number in your arraylist : ");
	 startNumber=input.nextInt();
	 System.out.println("Enter the last element number in your arraylist : ");
	 lastNumber=input.nextInt();
	 ArrayList<Integer> list = new ArrayList<>();
	 for (int i =startNumber; i <=lastNumber ; i++)
	 {
       list.add(i);
	 }
	// list.removeIf(i->i%2==0);

	/* for(int i=0;i<list.size();i++)
	 {
		 if(list.get(i)%2==0)
		 {
			 list.remove(i);
		 }
	 }*/
	 list.forEach((array)->System.out.println(array));
	 System.out.println(list);
	 input.close();
	}
}
