package inheritance;
class Base
{
	public Base()
	{
		System.out.print("Base");
	}
}
    public class Derived extends Base
    {
    	public Derived()
    	{
        	this("Java");
            System.out.print("Derived");
        }
    	public  Derived(String  s)
    	{
    		System.out.print(s);
    	}
    	public  static void main(String[] args)
    	{
    		new Derived();
    	}
    }

