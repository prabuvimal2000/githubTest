import java.util.Scanner;
public class Fahrenheit{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //Enter the value in celcius
       float c=sc.nextFloat();
       //convert into Fahrenheit
       float f=(c*9)/5+32;
       System.out.println(Math.round(f*100)/100.0);
    }
}
