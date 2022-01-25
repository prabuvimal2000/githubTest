package file;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
//import java.io.IOException;
public class FileReaderExample 
{
	public static void main(String[] args) throws Exception 
	{
		      
	          /*int data;    
	          try
	          {
	          FileReader file=new FileReader("C:/FileStream/newFile.txt");    
	          while((data=file.read())!=-1)  
	          {
	        	  if(data==0)
	        	  {
	        		  System.out.println("File is empty");
	        	  }
	        	  else
	        	  {
	        	  System.out.print((char)data); 
	        	  }
	          }
	          file.close();  
	          }*/
		        int data; 
		        try
		        {
		           File file = new File("C:/FileStream/newFile.txt");
		           FileReader fileRead = new FileReader("C:/FileStream/newFile.txt");
		           System.out.println("The file is available : ");
		           if(file.length()==0)
		           {
		        	   System.out.println("The file empty");
		           }
		           else
		           {
		           while ((data=fileRead.read())!=-1)
			        {
			            System.out.print((char)data);
			        }
		           }
		           fileRead.close();
		        }
		        catch (FileNotFoundException  exception)
		        {
		        	System.out.println("Error occured : "+exception);
		            System.out.println("File not found");
		        }
		        catch (Exception exception)
		        {
		        	System.out.println("Exception error occured ");
		        	System.out.println("The file is Empty : "+exception);
		        }
		}
}
