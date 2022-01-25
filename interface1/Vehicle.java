package interface1;

public class Vehicle 
{
 public static void main(String[] args)
 {
	 Car carService = new Car();
	 carService.setMonths(15);
	 carService.getServiceTime();
	 carService.displayHistory();
	 Bike bikeService = new Bike();
	 bikeService.setMonths(12);
	 bikeService.getServiceTime();
	 bikeService.displayHistory();
 }
}
