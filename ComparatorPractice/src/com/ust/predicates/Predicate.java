package com.ust.predicates;

@FunctionalInterface
public interface Predicate<T> {
	
	public boolean test(T t);
	
	public default Predicate<T> and(Predicate<T> other){
		Predicate<T> p = (t)->{
				System.out.println(t);
				System.out.println(other);
				return test(t)&&other.test(t);
			};
		return p;
	}
	
}
