package file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class MobileDetails
{
	private String mobileName;
	private float mobileCost;
	MobileDetails(String mobileName,float mobileCost)
	{
		this.mobileName = mobileName;
		this.mobileCost = mobileCost;
	}
	public void setMobileName(String mobileName) 
	{
		this.mobileName = mobileName;
	}
	public String getMobileName()
	{
		return mobileName;
	}
	public void setMobileCost(float mobileCost) 
	{
		this.mobileCost = mobileCost;
	}
	public float getMobileCost() 
	{
		return mobileCost;
	}
}
public class MobileCostDetails 
{
	public static void main(String[] args) throws IOException 
	{
		String searchMobile,newMobile,updateMobileName;
		float newMobileCost,updateMobileCost;
		boolean isTrue=true;
		BufferedReader fileRead = new BufferedReader(new FileReader("C:\\FileStream\\Items.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <MobileDetails> mobileList = new ArrayList <MobileDetails> ();
		String fileData = fileRead.readLine();
	    while (fileData !=null)
	    {
	    	String[] mobileCostArr = fileData.trim().split("-");
	    	String mobileName = mobileCostArr[0];
	    	float mobileCost = Float.valueOf(mobileCostArr[1]);
	    	mobileList.add(new MobileDetails(mobileName,mobileCost));
	    	fileData=fileRead.readLine();
	    }
			  
	 /*   for(MobileDetails e : mobileList)
	    {
	    	System.out.println(e.getMobileName());
	    	e.getMobileCost();
	    }*/
	    System.out.println("Please Enter the mobile model to search : ");
	    searchMobile = reader.readLine();
	    for (MobileDetails model : mobileList)
	    {
	    	if(model.getMobileName().contains(searchMobile))
	    	{
	    		System.out.println("Yes Your searched model is here "+"\n "+model.getMobileName()+" - "+model.getMobileCost());
	    		isTrue=false;
	    		break;
	    	}
	    }
	    if(isTrue==true)
	    {
	    	System.out.println("Sorry !Your searched model is not here ");
	    }
	    System.out.println("Please enter the data to add to file \nPlease Enter the mobile name :");
	    newMobile= reader.readLine();
	    System.out.println("Please Enter the mobile cost :");
	    newMobileCost=Float.valueOf(reader.readLine());
	    mobileList.add(new MobileDetails(newMobile,newMobileCost));
	    /* Update file 
	     */
	    BufferedWriter fileWriter = new BufferedWriter(new FileWriter("C:\\FileStream\\Items.txt"));
	    System.out.println("Please enter the data to add to file \nPlease Enter the change mobile  name :");
	    updateMobileName= reader.readLine();
	    System.out.println("Please Enter the updated mobile cost :");
	    updateMobileCost=Float.valueOf(reader.readLine());
	    for (MobileDetails model : mobileList)
	    {
	    	if(model.getMobileName().contains(updateMobileName))
	    	{
	    		model.setMobileCost(updateMobileCost);
	    		System.out.println("Updated Sucessfully");
	    		break;
	    	}
	    }
	    for(MobileDetails e : mobileList)
	    {
	    	
	    	fileWriter.write(e.getMobileName());
	    	fileWriter.write("- "+e.getMobileCost());
	    	fileWriter.newLine();
	    } 
	    /*
	     * Find the costliest item 
	     */
	    for (MobileDetails e : mobileList)
	    {

	    	System.out.println(e.getMobileName());
	    	System.out.println(e.getMobileCost());
	    }
	    float max=0;
		for (MobileDetails maxcost:mobileList) 
		{
	    	if(maxcost.getMobileCost()>max) 
	    	{
	    		max=maxcost.getMobileCost();
	    	}
	    }
		for (MobileDetails maxcost:mobileList)
		{
	    	if(maxcost.getMobileCost()==max) 
	    		System.out.println("The costliest item in the given list is : "+maxcost.getMobileName()+ " price is : "+max);
		}
	    fileWriter.close();
	    fileRead.close();
	}
}
