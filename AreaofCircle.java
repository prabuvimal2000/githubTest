import java.util.*;
import java.lang.Math;
class AreaOfCircle
{
  Scanner sc =new Scanner(System.in);
  float r=sc.nextFloat();   
  double area = Math.PI*Math.pow(r,2);
}
public class CircleArea
{
  public static void main(String[] args)
 {
      AreaOfCircle  r = new AreaOfCircle();
     System.out.println(r.area); 
  }
}
