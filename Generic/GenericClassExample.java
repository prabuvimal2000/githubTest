package Generic;

class GenericList<P>
{
	P value;

	public void setValue(P value) 
	{
		this.value = value;
	}
	public P getValue() 
	{
		return value;
	}
	
}
public class GenericClassExample 
{
 public static void main(String[] args)
 {
	 GenericList list = new GenericList<>();
	 list.setValue("Hi Prabu");
	 System.out.println(list.getValue());
	 list.setValue(10);
	 System.out.println(list.getValue());
	 //GenericList<Integer> list1=new GenericList<Integer>();
	 
 }
}
