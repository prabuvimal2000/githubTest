package sort;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingPriority 
{
	public static void main(String[] args)
	{
		ArrayList<ShoppingItem> list= new ArrayList<ShoppingItem>();
		list.add(new ShoppingItem("Eggs",4));
		list.add(new ShoppingItem("Bread",2));
		list.add(new ShoppingItem("Milk",6));
		list.add(new ShoppingItem("Water",3));
		list.add(new ShoppingItem("Meat",1));
		list.add(new ShoppingItem("Detergent",5));
		Collections.sort(list);
	    System.out.println("By these items by orderd way : ");
	    System.out.println("Priority \tItem");
	    for (ShoppingItem item: list)
	    {
	       //System.out.println(item.getItemPriority()+"\t\t"+item.getItemName());
	    	System.out.println(item);
	    }
	}
}
