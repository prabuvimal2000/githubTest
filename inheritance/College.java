package inheritance;

public class College {
	protected String name,address;
	protected int code;
    public void setData(String name,String address,int code)
    {
    	this.name=name;
    	this.address=address;
    	this.code=code;
    }
    public void display()
    {
    	System.out.println("College details :\nCollege name : "+name+"\nCollege address : "+address+"\nCollege code : "+code);
    }
}
