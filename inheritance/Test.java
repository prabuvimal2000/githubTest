package inheritance;
class Base1 
{
	public void displayBase()
	{
		System.out.println("Base class Method");
	}
}
class Derived1 extends Base1
{
	public void displayBase()
	{
		System.out.println("Derived class Method");
	}
}
public class Test
{
	public static void main(String[] args)
	{
		Base1 obj= new Derived1();
		obj.displayBase();
	}
	}
