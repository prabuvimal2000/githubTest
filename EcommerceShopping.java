/*
 * Program for billthe amount in ecommerce shopping.
 * @author Prabu M
 * @since Jul 1 2021
 * 
 */
package javatraining;
import java.util.Scanner;
public class EcommerceShopping {

	public static void main(String[] args)
	{
		System.out.println("Welcome to our website");
		System.out.println("These are the categories we have please choose what are things you need to visit:");
		System.out.println("1.Electronics\n2.Books\n3.Cloths\n just enter the number which you need to visit from above categories:\n");
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		String item="";
		int orginalPrice=0,quantity;
		float discountPercent,dicountPrice=0,billAmount;
		char userChoice,choice='Y';
		boolean booleanValue=false;
		while(choice=='Y')
		{
		switch(num)
		{
		 case 1:
			 System.out.println("Welcome to Electronics Categories:\nEnter what item you need to search:");
			 item=input.next();
			 orginalPrice=30000;
			 discountPercent=0.05f;
			 System.out.println("Enter the quantitity :");
			 quantity=input.nextInt();
			 dicountPrice= orginalPrice*discountPercent;
			 booleanValue=true;
			 break;
		 case 2:
			 System.out.println("Welcome to Books Categories:\nEnter what item you need to search:");
			 item=input.next();
			 orginalPrice=750;
			 discountPercent=0.10f;
			 System.out.println("Enter the quantitity :");
			 quantity=input.nextInt();
			 dicountPrice= orginalPrice*discountPercent;
			 booleanValue=true;
			 break;
		 case 3:
			 System.out.println("Welcome to Books Categories:\nEnter what item you need to search:");
			 item=input.next();
			 orginalPrice=100;
			 System.out.println("!!!Note that You can buy only multiples of 3 only.!!!\nEnter the quantitity :");
			 quantity=input.nextInt();
			 if(quantity>=3)
			 {
				 discountPercent=0.05f;
				 dicountPrice= orginalPrice*discountPercent*(quantity/3);
				 booleanValue=true;
			 }
			 else
			 {
				 System.out.println("You entered wrong count of books we cannot furether proceed thank you for visiting");
			 }
			 break;
	    default:
	    	 System.out.println("OOPS!Sorry your entered invalid category number.Do you want conitinue Yes/No");
	    	 userChoice=input.next().charAt(0);
	    	 if ('y'==userChoice||'Y'==userChoice)
	    	 {
	    		choice='Y';
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Thank you for visiting");
	    		 choice='N';
	    	 }
	    	 break;
		}
		if(booleanValue)
		{
			billAmount=orginalPrice-dicountPrice;
			System.out.println(item+" details are");
			System.out.println("OrginalPrice is :"+orginalPrice+"\n bill Amount "+billAmount+"\nYou saved arround "+dicountPrice);
			System.out.println("Thank you for visiting do you want to revist again: ");
			 userChoice=input.next().charAt(0);
			 if ('y'==userChoice||'Y'==userChoice)
	    	 {
	    		choice='Y';
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Thank you for visiting");
	    		 choice='N';
	    	 }
		}
		else if(choice!='Y')
		{
			choice='N';
		}
	}
		input.close();
	}

}
