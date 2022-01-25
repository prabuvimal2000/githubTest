package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Records
{
		String date;
		int level;
		String status;
		Records(String date,int level,String status)
		{
			this.date=date;
			this.level=level;
			this.status=status;
		}
		public String getDate() 
		{
			return date;
		}
		public void setDate(String date) 
		{
			this.date = date;
		}
		public int getLevel()
		{
			return level;
		}
		public void setLevel(int level)
		{
			this.level = level;
		}
		public String getStatus()
		{
			return status;
		}
		public void setStatus(String status) 
		{
			this.status = status;
		}	
	}
	public class HealthCheck
	{
		public static void main(String[] args)throws IOException
		{
			Scanner obj=new Scanner(System.in);
			BufferedReader read=new BufferedReader(new FileReader("C:/FileStream/Items.txt"));
			ArrayList<Records> list=new ArrayList<Records>();
			String line=read.readLine();
	        while(line!=null) {
	        	String[] array=line.split(" ");
	        	String date=array[0];
	        	int level=Integer.valueOf(array[1]);
	        	if(level>=90 && level<=110)
	        	{
	        	    list.add(new Records(date,level,"normal"));
	        	}
	        	else 
	        	{
	        		list.add(new Records(date,level,"abnormal"));

	        	}
	        	line=read.readLine();
	        }
	        BufferedWriter write=new BufferedWriter(new FileWriter("C:/FileStream/Items.txt.txt"));
	        for(Records i:list) 
	        {
	        	write.write(i.date);
	        	write.write(" "+i.level);
	        	write.write(" "+i.status);
	        	write.newLine();
	        }
	        for(Records i:list)
	        {
	        	System.out.println("DATE : "+i.getDate()+" LEVEL : "+i.getLevel()+" STATUS : "+i.getStatus());
	        }
	        read.close();
	        write.close();
	        obj.close();
		}
	}
