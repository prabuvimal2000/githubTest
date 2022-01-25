package inheritance;
public class BasketBall
{
  public static void main(String[] args)
  {
	  CollegeBasketBallPlayer player1 = new CollegeBasketBallPlayer("Vimal","KCK","center");
	  player1 .setHeight(82);
	  player1 .setWeight(230);
	  player1 .setSpeed(5);
	  player1 .setEligibilityRem(4);
	  player1 .setRole("Bench");
	  System.out.println("Player name : "+player1.getName()+"\nValue of the player is : "+player1.getValue());
	  System.out.println("Position of the player is : "+player1.getPosition());
	  player1.drafttable();
	  ProBasketBallPlayer player2= new ProBasketBallPlayer("Ram","MI","Forward");
	  player2.setHeight(78);
	  player2.setWeight(200);
	  player2.setSpeed(7);
	  player2.setYearsInLeague(8);
	  player2.setRole("Starter");
	  System.out.println("Player name : "+player2.getName()+"\nValue of the player is :"+player2.getValue());
	  System.out.println("Position of the player is : "+player2.getPosition());
	  System.out.println("Return value is : $"+player2.newContractValue());
  }
}
