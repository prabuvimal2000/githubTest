package interface1;

public class AutoMobileService 
{
	public static void main(String[] args)
	{
		Car car = new Car();
		car.setMonths(6);
		System.out.println(car.getServiceTime());
		car.displayHistory();
	}
}
