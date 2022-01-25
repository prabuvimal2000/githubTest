package file;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ReadWriteFile 
{
	public static void main(String[] args) 
	{
		  try
		  {    
			  String newData="Now im done file Inputstream&output Stream.\nCool!!!"; 
			  FileInputStream input = new  FileInputStream ("C:\\FileStream\\newFile.txt");
			  FileOutputStream outPut=new FileOutputStream("C:\\FileStream\\newFile.txt");
	          byte fileData[]=(newData).getBytes(); 
	          outPut.write(fileData);    
		      System.out.println("File is available : ");
		      int readfileData= input.read(); 
		      while(readfileData!=-1)
		      {
	            System.out.print((char)readfileData);  
	            readfileData=input.read();
		      }
		      input.close();
	          outPut.close();     
	          System.out.print("\n\"SucessFully updated\"");
	      }
		  catch(Exception exception)
			{
				System.out.println("Exception Error Found:");
				System.out.println(exception.getMessage());
			}  
	}
}
