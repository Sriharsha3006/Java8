package com.ust.predicates;

public class TestPredicate {

	public static void main(String[] args) {
		
		Predicate<String> p1 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length()<20;
			}
		};
		
		Predicate<String> p2 = t-> t.length()>5;
		
		Predicate<String> p3 = t-> t.length()<20&&t.length()>5;
		
		System.out.println("Test 'Hello'"+p1.test("Hello"));
		
		System.out.println("Test 'Harsha'"+p2.test("Har"));
		
		//Predicate<String> p3=p1.and(p2);
		System.out.println(p3.test("Sriharsha"));
	}

}
