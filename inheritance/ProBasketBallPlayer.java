package inheritance;

public class ProBasketBallPlayer extends  BasketBallPlayer
{
	private int yearsInLeague;
	private String role;
	private int[] value= {1200000,1000000,800000,500000,200000};
	public ProBasketBallPlayer()
	{
		super();
		yearsInLeague=0;
		role="bech";
	}
	public ProBasketBallPlayer(String name,String team,String position) 
	{
		super(name,team,position);
		yearsInLeague=0;
		this.role = "bench";
	}
	public ProBasketBallPlayer(String name,String team,String position,int yearsInLeague, String role) 
	{
		super(name,team,position);
		this.yearsInLeague = yearsInLeague;
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getYearsInLeague() {
		return yearsInLeague;
	}
	public void setYearsInLeague(int yearsInLeague) {
		this.yearsInLeague = yearsInLeague;
	}
	public int newContractValue()
	{
		if(super.getValue()>=8 && yearsInLeague>=10 )
		{
			if(role.equalsIgnoreCase("Starter"))
			{
				return value[0];
			}
			else if (role.equalsIgnoreCase("Bench"))
			{
				return value[2];
			}
		}
		else if (super.getValue()>=5 && yearsInLeague>=8 && super.getValue()<=7)
		{
			if(role.equalsIgnoreCase("Starter"))
			{
				return value[1];
			}
			else if (role.equalsIgnoreCase("Bench"))
			{
				return value[3];
			}
		}
		else if (super.getValue()>=8 && yearsInLeague>=8 )
		{
			if(role.equalsIgnoreCase("Starter"))
			{
				return value[2];
			}
			else if (role.equalsIgnoreCase("Bench"))
			{
				return value[4];
			}
		}
		return 0;
	}
}
