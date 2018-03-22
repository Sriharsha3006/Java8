package com.ust;

import java.util.ArrayList;

public class PersonData {
	
public ArrayList<Person> getPersonList(){
		
		ArrayList<Person> personList = new ArrayList<>();
		
		Person p = new Person("Sriharsha", "Bopparaju", 27, 2500);
		personList.add(p);
		p = new Person("Sriharsha", "Bopparaju", 27, 2500);
		personList.add(p);
		p = new Person("Sriharsha", "Bopparaju", 23, 2700);
		personList.add(p);
		p = new Person("Sriharsha", "Bopparaju", 27, 2000);
		personList.add(p);
		p = new Person("Sriharsha", "Bopparaju", 26, 2300);
		personList.add(p);
		
		p = new Person("Sriharsha", "Bopparaju", 27, 2500);
		personList.add(p);
		p = new Person("Sriharsha", "Bopparaju", 22, 2300);
		personList.add(p);
		p = new Person("Sriharsha", "Bopparaju", 28, 2500);
		personList.add(p);
		p = new Person("Sriharsha", "Bopparaju", 17, 2700);
		personList.add(p);
		
		p = new Person("Mahesh", "Bopparaju", 27, 2500);
		personList.add(p);
		p = new Person("Mahesh", "Bopparaju", 18, 2200);
		personList.add(p);
		p = new Person("Mahesh", "Nalla", 22, 2800);
		personList.add(p);
		p = new Person("Mahesh", "Bopparaju", 17, 2500);
		personList.add(p);
		
		p = new Person("Mahesh", "Nalla", 27, 2000);
		personList.add(p);
		p = new Person("Mahesh", "Bopparaju", 28, 2700);
		personList.add(p);
		p = new Person("Mahesh", "Nalla", 23, 2900);
		personList.add(p);
		p = new Person("Mahesh", "Nalla", 17, 2200);
		personList.add(p);
		
		return personList;
	}
}
