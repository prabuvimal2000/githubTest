package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class BufferReaderExample 
{
	public static void main(String[] args) 
	{  
		int data;
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/FileStream/newFile.txt"));   
			if (br.readLine() == null) {
			    System.out.println("No errors, and file empty");
			}
			else
			{
				while ((data=br.read())!=-1)
		        {
		            System.out.print((char)data);
		        }
			}
			br.close();
		} 
		catch (FileNotFoundException exception) {
			exception.printStackTrace();
			
		}
		catch(Exception exception)
		{
			
			System.out.println(exception);
		}
	}
}
