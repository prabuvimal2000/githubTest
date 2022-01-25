package file;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderCharExample 
{
 public static void main(String[] args) throws IOException
 {
	 File file = new File ("C:/FileStream/Items.txt");
	 char[] fileData = new char[(int)file.length()];
	 //FileReader fileRead = new FileReader(file);
	 BufferedReader fileRead = new BufferedReader(new FileReader(file));
	 //fileRead.read(fileData)
	 for(char data:fileData)
	 {
		 System.out.print(data);
	 }
	 
	 fileRead.close();
 }
}
