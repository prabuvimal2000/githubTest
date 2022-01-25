package exception;
import java.util.Arrays;
import java.util.Scanner;
public class CricketPlayer
{
  private String name;
  private static int noOfInnings,noOfTimesNotOut,totalRuns;
  private static float bat_Avg;
  CricketPlayer()
  {
	  name="";
	  noOfInnings=0;
	  noOfTimesNotOut=0;
	  totalRuns=0;
	  bat_Avg=0.0f;
  }
  CricketPlayer(String name,int noOfInnings,int noOfTimesNotOut,int totalRuns)
  {
	  this.name=name;
	  this.noOfInnings=noOfInnings;
	  this.noOfTimesNotOut=noOfTimesNotOut;
	  this.totalRuns=totalRuns;
  }
  public static float avg()
  {
	 // CricketPlayer newPlayer= new CricketPlayer();
	   try
	   {
//	     newPlayer.bat_Avg=newPlayer.totalRuns/(newPlayer.noOfInnings-newPlayer.noOfTimesNotOut);
		  bat_Avg=totalRuns/(noOfInnings-noOfTimesNotOut);
	   }
	   catch (ArithmeticException exception)
	   {
		  System.out.println("Exception Error found :");
		  System.out.println(exception);
	   }
	  return bat_Avg;
  }
  public static void sortPlayer(float[] bating_Avg,String player)
  {
	  //CricketPlayer newPlayer= new CricketPlayer();
	  Arrays.sort(bating_Avg);
	  for(int i=0;i<bating_Avg.length;i++)
	  {
	      System.out.println("PlayerNAme"+player+"Bating_avg is : "+bating_Avg[i]);
	  }
  }
  public static void main(String[] args)
  {
	  String name="";
	  int noOfInnings,noOfTimesNotOut,totalRuns,noOfPlayers;
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the no of players : ");
	  noOfPlayers = input.nextInt();
	  float[] player_Bat_Avg= new float[noOfPlayers];
	  CricketPlayer[] players = new CricketPlayer[noOfPlayers];
	  for(int i=0;i<noOfPlayers;i++)
	  {
		  System.out.println("Enter the name of the player : ");
		  name=input.next();
		  System.out.println("Enter the no of innigs he played : ");
		  noOfInnings=input.nextInt();
		  System.out.println("Enter the no of Times he notout : ");
		  noOfTimesNotOut=input.nextInt();
		  System.out.println("Enter the total runs he scored : ");
		  totalRuns=input.nextInt();
		  players[i]=new CricketPlayer(name,noOfInnings,noOfTimesNotOut,totalRuns);
		  player_Bat_Avg[i]=avg();
		  sortPlayer(player_Bat_Avg,name);
	  }
	 /* for (float f: player_Bat_Avg)
	  {
		  System.out.print(f);
	  }*/
	  input.close();
  }
}
