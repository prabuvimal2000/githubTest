package streamapiexaples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
public class StreamAPIExamples
{
	public static void main(String[] args) 
	{
		List<Integer> numList = Arrays.asList(10,40,50,20,9,2);
		List<Integer> numList1=numList.stream().map(num-> num*2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		List<Integer> numList2=numList.stream().map(num-> num*2).sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList()); 
		//(a, b) -> b.compareTo(a)numList.stream().map(num-> num*2).sorted().forEach(System.out::println);
		System.out.println(numList1);
		System.out.println(numList2);
	}
}
