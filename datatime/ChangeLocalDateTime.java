package datatime;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
public class ChangeLocalDateTime
{
	public static void main(String[] args)
	{
		DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		 DateTimeFormatter currentDate1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		 LocalDateTime presentTime = LocalDateTime.now();  
		 System.out.println("Current Date and Time : "+currentDate.format(presentTime)); 
		 System.out.println(presentTime);
		 System.out.println("last day of the sunday in this month is : "+currentDate1.format(presentTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY))));
		 System.out.println("last day of the sunday in this year is : "+currentDate1.format(presentTime.with(TemporalAdjusters.lastDayOfYear())));
		 LocalDateTime futureTime=presentTime.minusMinutes(10).plusDays(10);
		 System.out.println(futureTime);
		 System.out.println(presentTime.isEqual(futureTime));
		 System.out.println(futureTime.getDayOfWeek());
		 System.out.println("Increase the Year by 8 :");
		 System.out.println(currentDate1.format(presentTime.plusYears(8)));
		 System.out.println("First day of the next year is : "+currentDate1.format(presentTime.with(TemporalAdjusters.firstDayOfNextYear())));
		 System.out.println("previous friday date : "+currentDate1.format(presentTime.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))));
	}
}
