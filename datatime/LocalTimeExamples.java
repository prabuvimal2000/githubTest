package datatime;
import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
public class LocalTimeExamples {
	public static void main(String[] args)
	{
		
		LocalTime now=LocalTime.now();
		LocalTime lunch = LocalTime.of(15, 00);
		System.out.println("Current time : "+now);
		System.out.println("Current time : "+now.truncatedTo(ChronoUnit.MINUTES));
		long newTime;
		newTime=now.until(lunch, ChronoUnit.MINUTES);
		System.out.println(newTime);
		System.out.println();
		Duration time = Duration.between(now, lunch);
		System.out.println(time);
	}

}
