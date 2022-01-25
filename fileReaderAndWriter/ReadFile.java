package file;
import java.io.FileInputStream;
public class ReadFile 
{
	public static void main(String[] args)
	{
		try
		{
	     FileInputStream input = new  FileInputStream ("C:\\FileStream\\newFile.txt");
//	      FileInputStream input = new  FileInputStream ("C:\\FileStream\\new.txt");
	      System.out.println("File is available : ");
	      int fileData= input.read(); 
	      while(fileData!=-1)
	      {
            System.out.print((char)fileData);  
            fileData=input.read();
	      }
	      input.close();
		}
		catch(Exception exception)
		{
			System.out.println("Exception Error Found:");
			System.out.println(exception.getMessage());
		}
	}
}
