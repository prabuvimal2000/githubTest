package file;
import java.io.FileOutputStream;
public class WriteFile 
{
	public static void main(String[] args) 
	{
		  try
		  {    
			  String newData="Now im done file Inputstream and output Stream.\nCool!!!"; 
			  FileOutputStream outPut=new FileOutputStream("C:\\FileStream\\newFile.txt");
	          byte fileData[]=(newData).getBytes(); 
	          outPut.write(fileData);    
	          outPut.close();     
	          System.out.println("SucessFully updated");
	      }
		  catch(Exception exception)
			{
				System.out.println("Exception Error Found:");
				System.out.println(exception.getMessage());
			}  
	}
}
