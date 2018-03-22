package org.ust;

public interface Interface2{
	
	void interfaceTwo();
	
	default void sayHello() {
		System.out.println("Hello");
	}
	
	static void print(String str) {
		System.out.println("In Interface 2");
		System.out.println(str);
	}
	
	public void hi();
	
}