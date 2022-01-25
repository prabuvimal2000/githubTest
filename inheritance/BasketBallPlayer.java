package inheritance;

public class BasketBallPlayer {
	protected String name,team,position;
	protected int height,weight,speed;
    BasketBallPlayer()
    {
    	name="";
    	team="";
    	height=0;
    	weight=0;
    	speed=0;
    	position="";
    }
    BasketBallPlayer(String name,String team,String position)
    {
    	this.name=name;
    	this.team=team;
    	this.position=position;
    }
    BasketBallPlayer(String name,String team,String position,int height,int weight,int speed)
    {
    	this.name=name;
    	this.team=team;
    	this.position=position;
    	this.height=height;
    	this.weight=weight;
    	this.speed=speed;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
    public int getValue()
    {
    	int value=0;
    	if(height>=80)
    	{
    		if( ((weight>220 && weight<250) && position.equalsIgnoreCase("center"))||(speed>7 && position.equalsIgnoreCase("forward")))
    	   {
    		 value=10;
    	   }
    	}
    	else if (height>=78)
    	{
    		if( ((weight>210 && weight<260) && position.equalsIgnoreCase("center"))||(speed>5 && position.equalsIgnoreCase("forward")))
     	   {
     		 value=5;
     	   }
    		else if (speed>7 && position.equalsIgnoreCase("guard"))
    		{
    			value =10;
    		}
    	}
    	else if (height>=76)
    	{
    		if( ((weight>180 && weight<220) && position.equalsIgnoreCase("center"))||(speed>4 && position.equalsIgnoreCase("forward")))
      	   {
      		 value=3;
      	   }
    		else if (speed>6 && position.equalsIgnoreCase("guard"))
    		{
    			value=5;
    		}
    	}
    	else if (height>=74)
    	{
    		if(speed>5 && position.equalsIgnoreCase("guard"))
       	   {
       		 value=3;
       	   }
    	}
    	else
    	{
    		value=0;
    		//System.out.println("Sorry your height is short");
    	}
   
    	return value;
    }
}
