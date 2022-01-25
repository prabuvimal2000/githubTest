package datatime;
import java.util.Scanner;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class CalculateTrainArraivalTime {
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
		      String deptTime ="01:45 pm";  // consider the train Depart Time
		      String arrTime ="08:45 pm";  // consider the train Arrival Time
		      String pattern = "hh:mm a";
		      int hour,min;
		      LocalTime time_d=LocalTime.parse(deptTime, DateTimeFormatter.ofPattern("hh:mm a")); 
		      LocalTime time_a=LocalTime.parse(arrTime , DateTimeFormatter.ofPattern("hh:mm a"));
		      System.out.println("Enter the Hours of Train Delay Time");
		      hour=sc.nextInt();
		      System.out.println("Enter the Minutes of Train Delay Time");
		      min=sc.nextInt();
		      time_a=time_a.plusHours(hour);
		      time_a=time_a.plusMinutes(min);
		      System.out.println("Dear passengers, Sorry!! for the inconvence...");
		      System.out.println("A Chozha Express Train was ["+hour+"] hours ["+min+"] Minutes Late..");
		      System.out.println("It Arrived Coimbatore at "+time_a.format(DateTimeFormatter.ofPattern("hh:mm a")));
		    sc.close();
	}

}
