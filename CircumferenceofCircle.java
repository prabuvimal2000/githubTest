import java.util.*;
import java.io.*;
public class CircumferenceofCircle {
    public static double circumference(double r)
    {
        double circumference = 2*Math.PI*r;
        return (Math.round(circumference*100)/100.0) ;
    }
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      //enter the radius of a circle
      double r=sc.nextDouble();
      if(r>0)
      {
        System.out.println(circumference(r));
      }
       else
      {
          System.out.println("Error");
      }
    }
}
