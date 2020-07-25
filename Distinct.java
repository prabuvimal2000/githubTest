import java.util.*;
public class Distinct {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int[] arr = new int[size];
     for(int i=0;i<size;i++)
     {
         arr[i]=sc.nextInt();
     }
     HashSet<Integer> set = new HashSet<>();
     for(int i=0;i<size;i++)
     {
         if(!set.contains(arr[i]))
         {
             set.add(arr[i]);
             System.out.print(arr[i]+" ");
         }
     }
    }
}
