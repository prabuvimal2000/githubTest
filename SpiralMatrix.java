import java.io.*;
public class SpiralMatrix
{  
   public static void spiral(int[][] a,int r,int c)
   {  
     int k=0,l=0,last_row=r-1,last_col=c-1;
     int n=a.length;
     System.out.println("");  
     while(k<=last_row&&l<=last_col)
    {     
     for(int i=l;i<=last_col;i++)        
    {         
       System.out.print(a[k][i]+" "); 
     }     
    k++;         
   for(int i=k;i<=last_row;i++)     
   {         
     System.out.print(a[i][last_col]+" ");         
   }         
    last_col--;
    if(k<=last_row)
    {
        for(int i=last_col;i>=l;i--)
        {
              System.out.print(a[last_row][i]+" ");
         }
    }
    last_row--;
    if(l<=last_col)
    {
         for(int i=last_col;i>=k;i--)
         {
             System.out.print(a[i][l]+" ");
         }
     }
    l++;
    }
 }
 public static void main(String []args)
{
  int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};  
  int row=4,col=4;   
  for(int i=0;i<row;i++)  
    {
      for(int j=0;j<col;j++)      
     {         
       System.out.print(arr[i][j]+"\t");   
     }
     System.out.println("");    
    }      
    spiral(arr,row,col);
    }
}
