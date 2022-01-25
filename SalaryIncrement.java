/*
 * Program for find the how much salary is increment for the user from his previous salary and from his rating. 
 * @author Prabu M
 * @since Jun 29 2021
 * 
 */
package javatraining;
import java.util.Scanner;
public class SalaryIncrement {
	
 public static float apparaisalSalaryForRating(float salary,float percent)
 {
	 salary=salary+(salary*percent);
	 return salary;
 }
 public static void main(String args[])
 {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the salary: ");
	 float salary=input.nextFloat();
	 System.out.println("Enter the appraisal rating: ");
	 float rating=input.nextFloat();
	 if (salary!=0 && (rating>=1 && rating<=10))
	 {
		float percentage=0.0f,new_Salary=0.0f;
	    if (rating>=1 && rating<=4)
	    {
		 percentage=0.1f;
		 new_Salary=apparaisalSalaryForRating(salary,percentage);
	     }
	    else if (rating>=4.1 && rating<=7)
	    { 
		 percentage=0.25f;
		 new_Salary=apparaisalSalaryForRating(salary,percentage);
	     }
	     else if (rating>=7.1 && rating<=10)
	     {
		 percentage=0.30f;
		 new_Salary=apparaisalSalaryForRating(salary,percentage);
	     }
	    System.out.println(new_Salary);
	 }
    else 
    {
    	System.out.println("Inavalid salary");
    }
	 input.close();
 }
 }
