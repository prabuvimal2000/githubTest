import java.util.Scanner;
public class MiniNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = {5,4,3,2,1,7,6,10,8,9};
        int n=arr.length;
        int temp;
        //use also Arays.sort(a);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
         System.out.println(arr[0]);
    }
}






