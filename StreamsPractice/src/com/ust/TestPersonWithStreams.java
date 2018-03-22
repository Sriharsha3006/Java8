package com.ust;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestPersonWithStreams {

	public static void main(String[] args) {
		
		ArrayList<Person> personList = new ArrayList<>();
		PersonData personData = new PersonData();
		personList = personData.getPersonList();
		ArrayList<Person> personListofSupplier=personData.getPersonList();
		personList.forEach(System.out::println);
		
		//1)No.of Persons with salary >2500
		/*A Stream should be operated on (invoking an intermediate or terminal stream operation) only once.
		A Stream implementation may throw IllegalStateException if it detects that the Stream is being reused.
		we’re only allowed to perform a single operation that consumes a Stream.
		After the #count() method is invoked, the stringStream is closed, therefore, any further operation 
		on the Stream will throw the IllegalStateException, and that’s what happened after invoking the 
		#count() method.*/
		Stream<Person> salaryStreamGT2500 = personList.stream();
		System.out.println(salaryStreamGT2500.map(Person::getSalary).filter((sal)->sal>2500.0).count());
		//System.out.println(salaryStreamGT2500.mapToDouble(p->p.getSalary()).filter((sal)->sal>2300.0).count());
		
		//Solution create a new stream for any other use case
		//as below
		Stream<Person> salaryStreamGT2300 = personList.stream();
		System.out.println(salaryStreamGT2300.mapToDouble(p->p.getSalary()).filter((sal)->sal>2300.0).count());
		
		//If you want to use multiple stream on the same list, create a Supplier of stream as below
		
		Supplier<Stream<Person>> personStream = ()->personListofSupplier.stream();
		//Minimum Salary
		Stream<Person> minSalaryStream = personStream.get();
		System.out.println(minSalaryStream.mapToDouble(p->p.getSalary()).min().orElse(0));
		
		
		
		//Perform distinct operation on Person. firstname With Caps
		Stream<Person> streamWithDistinctFirst = personList.stream();
		streamWithDistinctFirst.map((p)->p.getFirstName().toUpperCase()).distinct().forEach(System.out::println);
		
		//Sum ...Avg of the salary
		Stream<Person> avgOfSalaryStream = personList.stream();
		System.out.println(avgOfSalaryStream.mapToDouble(Person::getSalary).sum());
		//System.out.println(avgOfSalaryStream.mapToDouble(Person::getSalary).average().getAsDouble());
	}

}
