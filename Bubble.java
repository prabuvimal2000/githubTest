import java.util.*;
//Bubble sort 
public class Bubble
{
  public static void checkBubble(int[] arr)
 {       
          int n= arr.length;
          for(int i=0;i<n;i++)
          {
               for(int j=1;j<n-i;j++)
               {
                     if(arr[j-1]>=arr[j])
                     {
                         int temp=arr[j-1];
                         arr[j-1]=arr[j];
                         arr[j]=temp;
                      }
                }
          }
 }
 public  static void main(String args[])
 {
      Scanner input =new Scanner(System.in);
      System.out.println("Enter the size of the Array : ");
      int size=input.nextInt();
      int[] arr=new int[size];
      System.out.println("Enter the elementes to the array");
      for(int i=0;i<arr.length;i++)
      {
               arr[i]=input.nextInt();
      }
     checkBubble(arr);
     for(int i=0;i<arr.length;i++)
       {
            System.out.print(arr[i]+" ");
       }
  }
}
