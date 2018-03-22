package org.ust;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Class2 {
	
	public void sayWorld() {
		System.out.println("World Class 1");
	}
	
	public void sayHello() {
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		
		List<String> collect = alpha.stream().map(t-> t.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
	}

}