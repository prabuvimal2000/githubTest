import java.util.*;
import java.lang.*;
public class DistinctString {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     String[] arr = s.split(" ");
     HashSet<String> set = new HashSet<>();
     for(int i=0;i<arr.length;i++)
     {
         if(!set.contains(arr[i]))
         {
             set.add(arr[i]);
             System.out.print(arr[i]+" ");
         }
     }
    }
}
