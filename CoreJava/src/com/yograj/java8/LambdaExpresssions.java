package com.yograj.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpresssions {

	public static void main(String[] args) {
		
		List<Person> personList = Arrays.asList(new Person("Raj", "Aryan", 28),
				new Person("Virat", "Kohali", 30),
				new Person("Sachin", "Tendulkar", 40),
				new Person("Rohit", "Sharma", 32),
				new Person("Virendar", "Sehwag", 35));
		
	
		//Collections.sort(personList, new Comparator);
	/*Collections.sort(personList, new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getFirstName().compareTo(o2.getFirstName());
		}});*/
		
		Collections.sort(personList, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()) );
	
	for(Person p : personList)
		System.out.println(p);
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	printConditionally(personList, p -> true);
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	printConditionally(personList, p -> p.getFirstName().startsWith("V"));
	
	
	}

	private static void printConditionally(List<Person> personList, Condition c) {
		for(Person p: personList) {
			if(c.test(p))
				System.out.println(p);
		}
		
	}
	
	
	
}

interface Condition{
	boolean test(Person p);
}