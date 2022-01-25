package inheritance;

public class EmployeeDetails {
	public static void main(String[] args)
	{
		Permanent emp=new Permanent();
		Contract emp1=new Contract();
		emp.setPermanentData(10,"A",2011,"Room");
		emp1.setContractData(5,"A+",2016,"Room&Food");
		emp.setEmpData("Kumar","7,kannur,Kerala","3456756712",30000);
		emp1.setEmpData("VinodKumar","10,coimbatore,tamilnadu","9865645345",10000);
		emp.printSalary();
		emp1.printSalary();
	}
}
