package Generic;

/*
 * Program for swap pair using Generic method .
 * @author Prabu M
 * @since Aug 17 2021
 * 
 */ 
class Pair
{

   public static <F,S> void swap(F first,S second)
   {
	   F first1 = first;
	   S second1=second;
	   first= (F) second1;
	   second= (S) first1;
	   System.out.println(first+" "+second);
   }
}
public class SwapTwoData 
{
 public static void main(String[] args)
 {
	 Pair.swap("Prabu",7);
	 Pair.swap(12.50, 12);
	 Pair.swap(30,55);
 }
}
/*class Pair<F,S>
{
   F first;
   S second;
   Pair(F first,S second)
   {
	   this.first=first;
	   this.second=second;
   }
   public void swapedData()
   {
	   F first1 = first;
	   S second1=second;
	   first= (F) second1;
	   second= (S) first1;
	   System.out.println(first+" "+second);
   }
}
public class SwapTwoData 
{
 public static void main(String[] args)
 {
	 Pair list = new Pair<>("Prabu",7);
	 list.swapedData();
 }
}
/*class Pair
{
   public static <F,S> void swapedData(F first,S second)
   {
	   F first1 = first;
	   S second1=second;
	   first= (F) second1;
	   second= (S) first1;
	   System.out.println(first+" "+second);
   }
}
public class SwapTwoData 
{
 public static void main(String[] args)
 {
	 Pair list = new Pair();
	 list.swapedData("Prabu",7);
 }
}*/
