import java.util.Scanner;
import java.io.*;
public class  EquilateralTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        //enter the side of a triange
        int a = input.nextInt();
        double area = Math.sqrt(3)/4*a*a;
        System.out.println(Math.round(area*100.0)/100.0);
    }
}
