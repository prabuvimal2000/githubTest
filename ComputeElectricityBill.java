import java.util.*; 
public class  ComputeElectricityBill
{ 
    public static float calculateBill(int units) 
    { 
        if (units <= 100) 
        { 
            return 0; 
        } 
        else if (units <= 200)
        { 
            return (100*0)+(units-100)*3; 
        } 
        else if (units <= 300) 
        { 
            return (100*0)+ (100 * 3)+ (units - 200)*10; 
        } 
        else if (units > 300)
        { 
            return (100*0)+(100*3)+(100*10)+(units-300)*15; 
        } 
        return 0; 
    } 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units how much power consuemd know : ");
        int units= sc.nextInt();
        System.out.println("Your electricity bill is Rs. "+calculateBill(units)); 
    } 
}
