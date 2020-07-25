import java.util.*;
public class ArrayMinValue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =10;
        int[] arr = new int[size];
        
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}






