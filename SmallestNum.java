import java.util.Scanner;
public class SmallestNum{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2=sc.nextInt();
        int result = (num1>num2)?num2:num1;
        System.out.println(result);
    }
}
