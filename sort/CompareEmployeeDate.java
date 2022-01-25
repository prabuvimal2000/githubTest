package sort;
import java.util.Comparator;

public class CompareEmployeeDate implements Comparator<EmployeeDetails>
{	
public int compare(EmployeeDetails emp, EmployeeDetails emp1) 
{
	return emp.getJoinedDate().compareTo(emp1.getJoinedDate()) ;
}

}
