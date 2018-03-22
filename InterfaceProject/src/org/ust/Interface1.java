package org.ust;

public interface Interface1 {
	
	void interfaceOne();
	
	default void sayHello() {
		System.out.println("Hello");
	}
	public void hi();
	static void print(String str) {
		System.out.println("In Interface 1");
		System.out.println(str);
	}
}
