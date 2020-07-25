import java.io.*;
public class Matrix
{
 public static void main(String[] args) throws Exception
 {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the row : ");
    int row = Integer.parseInt(input.readLine());
    System.out.println("Enter the column: ");
    int col = Integer.parseInt(input.readLine());
    int[][] matrix = new int[row][col];
    for(int i=0;i <row;i++)
    {
       for(int j=0;j<col;j++)
       {
           matrix[i][j]=Integer.parseInt(input.readLine());
        }
          System.out.println("");
     }
  System.out.println("BeforeTranspose: "); 
   for (int i=0;i <row;i++)
   {
          for(int j=0;j<col;j++)
          {
             System.out.print(matrix[i][j]+" ");  
           }
         System.out.println("");
    } 
   int[][] matrix1=new int [row][col];
   for (int i=0;i <col;i++)
   {
          for(int j=0;j<row;j++)
          {
             matrix1[j][i]=matrix[i][j];
           }
         System.out.println("");
    }  
   System.out.println("After Transpose : ");
    for (int i=0;i <row;i++)
   {
          for(int j=0;j<col;j++)
          {
             System.out.print(matrix1[i][j]+" ");  
           }
         System.out.println("");
    }  
 }
}
