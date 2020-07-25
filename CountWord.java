import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class CountWord
{
  public static void main(String[] args)
  {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        Map<String,Integer> map = new  HashMap<String,Integer>();
        String[ ] arr = str.split(" ");       
        int count =1;
        for(int i=0;i<arr.length;i++)
        {
               if(!map.containsKey(arr[i]))
               {
                       map.put(arr[i],count);
                }
               else
                {
                      map.put(arr[i],map.get(arr[i])+1);           
                 }
         }
         for(String i : map.keySet())
         {
                  System.out.println("The count of the word : "+ i + " = " +map.get(i));
         }
   }
}
