package org.ust;

import java.util.stream.IntStream;

public class TestMultipleInterface implements Interface1, Interface2 {
	enum Day{
		MON
	}
	@Override
	public void interfaceTwo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceOne() {
		// TODO Auto-generated method stub

	}

	
	
	/*public static void print(String str) {
		System.out.println("In Class");
		System.out.println(str);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultipleInterface test = new TestMultipleInterface();
		test.sayHello();
		//TestMultipleInterface.print("Which Interface?");
		Interface1.print("Sri");
		//System.out.println(Hello.MON.getDayNumber());
		System.out.println(test.isPrime(5));
		int[] arr = {1,2,3,4};
		System.out.println(test.allMatchArry(arr));
	}
	
	private boolean isPrime(Integer number) {		
		return number > 1&& IntStream
									.range(2, number)
									.noneMatch(t -> (number % t == 0));
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean allMatchArry(int[] arr) {
		return IntStream.
						range(1, 5)
						.allMatch(index -> {
							for(int i=0;i<arr.length;i++) {
								if(index!=arr[i])
									return false;
							}
							return true;
						});
						
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		Interface1.super.sayHello();
	}

}
