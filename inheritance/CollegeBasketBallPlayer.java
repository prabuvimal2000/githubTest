package inheritance;

public class CollegeBasketBallPlayer extends BasketBallPlayer {
	private int eligibilityRem;
	private String role;
	public CollegeBasketBallPlayer()
	{
		super();
		eligibilityRem=4;
		role="bech";
	}
	public CollegeBasketBallPlayer(String name,String team,String position) 
	{
		super(name,team,position);
		eligibilityRem=4;
		role="bech";
	}
	public CollegeBasketBallPlayer(String name,String team,String position,int eligibilityRem, String role) 
	{
		super(name,team,position);
		this.eligibilityRem = eligibilityRem;
		this.role = role;
	}
	public int getEligibilityRem() {
		return eligibilityRem;
	}
	public void setEligibilityRem(int eligibilityRem) {
		this.eligibilityRem = eligibilityRem;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean drafttable()
	{
		if(role.equalsIgnoreCase("Starter") && super.getValue()>4)
		{
			System.out.println( super.name+" is draftable player and he is a "+role+" player ");
			return true;
		}
		else if (role.equalsIgnoreCase("bench") && super.getValue()>=8)
		{
			System.out.println( super.name+" is draftable player and he is a "+role+" player ");
			return true;
		}
		else
		{
		return false;
		}
	}
}
