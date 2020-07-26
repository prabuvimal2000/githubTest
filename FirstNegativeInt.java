import java.util.*;
public class FirstNegativeInt{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
      boolean flag; 
    for (int i = 0; i<(n-k+1); i++)          
    { 
        flag = false; 
        for (int j = 0; j<k; j++) 
        { 
            if (arr[i+j] < 0) 
            { 
                System.out.print((arr[i+j])+" "); 
                flag = true; 
                break; 
            } 
        } 
        if (!flag) 
            System.out.print("0"+" "); 
     }
    }
}
