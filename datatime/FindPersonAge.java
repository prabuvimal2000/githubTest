package datatime;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class FindPersonAge 
{
	public static void main(String[] args) 
	{
		 String name = "Rani";
		 String isLeapYear;
		 long days ;
		 LocalDate personDeathDate,personBirthDate ;
		 personBirthDate = LocalDate.of(1946, Month.FEBRUARY,22);  
		// personBirthDate = LocalDate.parse("1946-02-22");  
		 personDeathDate = LocalDate.parse("2018-04-24"); 
		 Period ageOfaPerson =Period.between(personBirthDate,personDeathDate);
		 System.out.println(name +" was died at the age of  "+ageOfaPerson.getYears());
		 days = ChronoUnit.DAYS.between(personBirthDate,personDeathDate);
		 System.out.println(name+" lived "+days+" days");
		// System.out.println(name+" was lived almost "+ageOfaPerson.getYears()+" "+ageOfaPerson.getDays()+" "+ageOfaPerson.getMonths());
		// System.out.println(name+" was lived almost "+(ageOfaPerson.getYears()*365+ageOfaPerson.getDays()+ageOfaPerson.getMonths()*365/12)+" Days");
		 //System.out.println(name+" was lived almost "+personLived);
		 isLeapYear= (personBirthDate.isLeapYear())?"Yes "+name +" was borned in  leap year":"Sorry "+name+" was not borned in leap year ";
		 System.out.println(isLeapYear);
		 System.out.println(name+" was borned in "+personBirthDate.getDayOfYear()+" day in a year");
		 System.out.println(name+"lived by : "+ageOfaPerson.getYears()/10+" days");
		 LocalDate fiftyBdy=personBirthDate.plusYears(50);
		 System.out.println(name+"50 th birthday day of the week is : "+fiftyBdy.getDayOfWeek());
	}
}
