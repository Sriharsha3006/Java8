package com.ust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class TestPerson {

	public static void main(String[] args) {
		
		PersonData pd = new PersonData();
		ArrayList<Person> personList = pd.getPersonList();
		ArrayList<Person> personListWithSimple = pd.getPersonList();
		ArrayList<Person> personListForThenAndAll = pd.getPersonList();

		// Compare by First
		Comparator<Person> firstNameComparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		// Compare by Last
		Comparator<Person> lastNameComparator = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		//Compare by Age
		Comparator<Person> ageComparator = (p1,p2)-> p1.getAge()-p2.getAge();
		// Compare by Salary
		Comparator<Person> salaryComparator = (p1, p2) -> Double.compare(p1.getSalary(), p2.getSalary());
		
		
		Comparator<Person> cmp = ((firstNameComparator.thenComparing(lastNameComparator))
													 .thenComparing(ageComparator))
													 .thenComparing(salaryComparator);
		Collections.sort(personList, cmp);
		personList.forEach((p) -> System.out.println(p));
		
		System.out.println(".....................Break.....................");
		Collections.sort(personListWithSimple, firstNameComparator);
		Collections.sort(personListWithSimple, lastNameComparator);
		Collections.sort(personListWithSimple, ageComparator);
		Collections.sort(personListWithSimple, salaryComparator);
		personListWithSimple.forEach((p) -> System.out.println(p));
		
		Function<Person, String> f1 = (p)->p.getFirstName(); //Person::getFirstName
		Function<Person, String> f2 = Person::getLastName; //(p)->p.getLastName()
		Function<Person, Integer> f3 = (p)->p.getAge();
		Function<Person, Double> f4 = (p)->p.getSalary();
		
		Comparator<Person> allComparator = Comparator.comparing(f1)
													 .thenComparing(f2)
													 .thenComparing(f3)
													 .thenComparing(f4);
		
		Collections.sort(personListForThenAndAll,allComparator);
		System.out.println(".....................Break.....................");
		personList.forEach(System.out::println);
		
		System.out.println(personList.equals(personListForThenAndAll));
	}

}
