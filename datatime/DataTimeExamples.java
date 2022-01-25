package datatime;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DataTimeExamples {

	public static void main(String[] args) 
	{
		 DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH");  
		 LocalDateTime presentTime = LocalDateTime.now();  
		 System.out.println("Current Date and Time : "+currentDate .format(presentTime)); 
		 System.out.println("Current Date and Time : "+presentTime .format(currentDate));
		 System.out.println(presentTime);
		 LocalDateTime futureTime=presentTime.minusMinutes(10);
		 System.out.println(futureTime);
		 System.out.println(presentTime.isEqual(futureTime));
		 System.out.println(futureTime.getDayOfWeek());
		 System.out.println("Increase the Year by 8 :");
	}
}
