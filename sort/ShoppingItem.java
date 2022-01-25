package sort;

public class ShoppingItem implements Comparable<ShoppingItem>
{
 private String itemName;
 private int itemPriority;
 
 public int compareTo(ShoppingItem item)
 {
	  if(this.itemPriority>item.itemPriority)
	  {
		  return 1;
	  }
	  else if (this.itemPriority<item.itemPriority)
	  {
		  return -1;
	  }
	  else
	  {
		  return 0;
	  }
 }
 ShoppingItem(String itemName,int itemPriority)
 {
	 this.itemName=itemName;
	 this.itemPriority=itemPriority;
 }
 public void setItemName(String itemName) 
 {
 	this.itemName = itemName;
 }
public String getItemName() 
{
	return itemName;
}
public void setItemPriority(int itemPriority) 
{
	this.itemPriority = itemPriority;
}
public int getItemPriority() 
{
	return itemPriority;
}

public String toString()
{
    return itemPriority +"\t\t" + itemName;
}
}
