/*
 * Program for arrange the deatils of employee 
 * @author Prabu M
 * @since Aug 16 2021
 * 
 */
package sort;
import java.util.ArrayList;
import java.util.Collections;
public class Employee {

	public static void main(String[] args)
	{
		ArrayList<EmployeeDetails> list= new ArrayList<EmployeeDetails>();
		list.add(new EmployeeDetails("Puguky",25000,"2021-07-11"));
		list.add(new EmployeeDetails("Prabu",25500,"2021-04-10"));
		list.add(new EmployeeDetails("Niki",3000.55,"2021-08-11") );
		list.add(new EmployeeDetails("Akshai",30000,"2021-07-12"));
		Collections.sort(list);
	    System.out.println("Sorting by salary  ascending order: ");
	    System.out.println("Employee Name :\t Salary:\tDateOfJoining: ");
	    for (EmployeeDetails employee: list)
	    {
	       System.out.println(employee);
	    }
	    Collections.sort(list,Collections.reverseOrder());
	    System.out.println("\nSorting by salary in desending order: ");
	    System.out.println("Employee Name :\t Salary:\tDateOfJoining: ");
	    for (EmployeeDetails employee: list)
	    {
	       System.out.println(employee);
	    }
	    System.out.println("\nSorting by date of joining : ");
	    System.out.println("Employee Name :\t Salary:\tDateOfJoining: ");
	    Collections.sort(list,new CompareEmployeeDate());
	    for (EmployeeDetails employee: list)
	    {
	       System.out.println(employee);
	    }
	}
}
