//find largestnumber amoung three numbers
import java.util.*;
public class ThreeNum {
    public static void main(String[] args) {
     Scanner sc =new Scanner (System.in);
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     int num3 = sc.nextInt();
     /*int result = ((num1>num2)&&(num1>num3))?num1:((num2>num3)?num2:num3);
     System.out.println(result);*/
     if((num1>num2)&&(num1>num3))
     {
       System.out.println("The greatest number is "+num1);
     }
     else if(num2>num3)
     {
       System.out.println("The greatest number is "+num2);
     }
     else
     {
        System.out.println("The greatest number is "+num3);
     }
    }
}
