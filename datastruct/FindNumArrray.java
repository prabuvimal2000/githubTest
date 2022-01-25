package datastruct;
import java.util.Scanner;
import java.util.Arrays;
public class FindNumArrray 
{
 public static void main(String[] args)
 {
	 int size,key ;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the size of the array : ");
	 size = input.nextInt();
	 System.out.println("Enter the array elements : ");
	 int[] array = new int[size];
	 for (int i=0;i<size;i++)
	 {
		 array[i]=input.nextInt();
	 }
	 Arrays.sort(array);
	 System.out.println("Enter the number to find which index in this array : ");
	 key=input.nextInt();
	 System.out.println(key+ " found at index = "+ Arrays.binarySearch(array, key));
	 System.out.println(key+ " found at index = "+ Arrays.binarySearch(array,1,size,key));
	 Arrays.fill(array, key, size, key);
	 input.close();
 }
}
