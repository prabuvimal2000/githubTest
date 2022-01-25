package Generic;

import java.util.Arrays;
/*class GenericArray<T>
{
	  T minValue;
	  T maxValue;
	 GenericArray()
	 {
		 minValue=null;
		 maxValue=null;
	 }
	 GenericArray(T minValue,T maxValue)
	 {
		 this.minValue=minValue;
		 this.maxValue=maxValue;
	 }
	public T getMinValue() {
		return minValue;
	}
	public void setMinValue(T minValue) {
		this.minValue = minValue;
	}
	public T getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(T maxValue) {
		this.maxValue = maxValue;
	}
}
	/*public static <T> GenericArray<T> minMax(T minValue,T maxValue)
	{
	}
}
public class MinMaxInArray 
{
	
  public static void main(String[] args)
  {
	  Integer[] arr = {10,50,70,30,8,4};
	  Arrays.sort(arr);
	  for (int i:arr)
	  {
	  System.out.print(i+" ");
	  }
	  GenericArray array = new GenericArray<>();
	  array.minMax(arr[0],arr[arr.length-1]);
	  System.out.println(array.getMinValue()+""+array.getMaxValue());
  }
}*/
import java.util.List;
public class MinMaxInArray {
public static <T extends Comparable<T>> List<T> minMax(T[] list) {
     T minValue = list[0];
     T maxValue = list[0];
     for(int i = 1; i < list.length; i++) {
         if( minValue.compareTo(list[i]) > 0) { 
             minValue = list[i];
         }
         if( maxValue.compareTo(list[i]) < 0) { 
             maxValue = list[i];
         }
     }
     return Arrays.asList(minValue, maxValue); 
}
    public static void main(String[] args)  {
Integer[] array= { 15,30,40,2,6};
 System.out.println("Min max numbers in the given array is : ");
 System.out.print(minMax(array));    
}
}

