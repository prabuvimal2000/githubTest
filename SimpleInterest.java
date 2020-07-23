import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter the Principle amounr
        float p=sc.nextFloat();
        //enter the rate o interest
        float r=sc.nextFloat();
        //enter the no.of years
        float n=sc.nextFloat();
        double si=p*n*r/100;
        System.out.println(Math.round(si*100)/100.00);
    }
}
