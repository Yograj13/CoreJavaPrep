package com.yograj.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public  class CollectionHandsOn {

	List<String> arrayList= new ArrayList<>();


	public static void main(String []args) {


//		arrayListHandsOn();
//		
//	vectorHandsOn();
//
//	linkedListHandsOn();
//		
//		hashSetHandsOn();
//		
//		linkedSetHandsOn();
//		
//		treeSetHandsOn();
//		
//		hasMapHandsOn();
//		
		//hashTableHandsOn();
//		
//		linkedHashMapHandsOn();
//		
//		treeMapHandsOn();


	

	}

	private static void treeMapHandsOn() {
		// TODO Auto-generated method stub
		System.out.println("treeMapHandsOn handson============================>");
	}

	private static void linkedHashMapHandsOn() {
		// TODO Auto-generated method stub
		System.out.println("linkedHashMapHandsOn handson============================>");
	}

	private static void hashTableHandsOn() {
		// TODO Auto-generated method stub
		System.out.println("hashTableHandsOn handson============================>");
		Map<String,String> hashTable = new Hashtable<>();
		
		//hashTable.put(null, "V1");
		//hashTable.put("1", null);
		hashTable.put("", "V2");
		hashTable.put("", "V3");
		
		for(String str: hashTable.keySet())
			System.out.println(hashTable.get(str));
		
		
	}

	private static void hasMapHandsOn() {
		// TODO Auto-generated method stub
		System.out.println("hasMapHandsOn handson============================>");
	}

	private static void treeSetHandsOn() {
		System.out.println("treeSetHandsOn handson============================>");
		Set<String> sortedSet = new TreeSet<>();

		Set<String> hashSet = new HashSet<>();
		hashSet.add(null);
		hashSet.add("s1");
		hashSet.add("s2");
		hashSet.add("s1");
		hashSet.add(null);

		System.out.println("Print  HashSet==============>");
		for(String str: hashSet)
			System.out.println(str);
		

		sortedSet.add("A");
		sortedSet.add("D");
		sortedSet.add("C");
		sortedSet.add("K");
		sortedSet.add("");
		sortedSet.add("");
		sortedSet.add("");
		sortedSet.add("A");
		sortedSet.add(null);

		System.out.println("Print Sorted Set==============>");
		for(String str: sortedSet)
			System.out.println(str);

	}

	private static void linkedSetHandsOn() {
		// TODO Auto-generated method stub
		System.out.println("linkedSetHandsOn handson============================>");
		Set<String> hashSet = new LinkedHashSet<>();
		Set<String> sortedHashSet = new TreeSet<>((o1,o2) -> o1.compareTo(o2));
		hashSet.add(null);
		hashSet.add("s1");
		hashSet.add("s2");
		hashSet.add("s1");
		hashSet.add(null);

		System.out.println("Print  HashSet==============>");
		for(String str: hashSet)
			System.out.println(str);
		
		sortedHashSet.addAll(hashSet);


		System.out.println("Print Sorted Set==============>");
		for(String str: sortedHashSet)
			System.out.println(str);

		//inser element at 2nd from begining and 2nd from last 

		hashSet.add("2ndFromBegining");
		hashSet.add("2ndFromEnd");

			System.out.println("List after insertion");

		for(String str1: hashSet)
			System.out.println(str1);

	}

	private static void hashSetHandsOn() {
		
		System.out.println("hashSetHandsOn handson============================>");
		Set<String> hashSet = new HashSet<>();
		Set<String> sortedHashSet = new TreeSet<>((o1,o2) -> o1.compareTo(o2));
		hashSet.add(null);
		hashSet.add("s1");
		hashSet.add("s2");
		hashSet.add("s1");
		hashSet.add(null);

		System.out.println("Print  HashSet==============>");
		for(String str: hashSet)
			System.out.println(str);
		
		sortedHashSet.addAll(hashSet);


		System.out.println("Print Sorted Set==============>");
		for(String str: sortedHashSet)
			System.out.println(str);

		//inser element at 2nd from begining and 2nd from last 
/*
		hashSet.add("2ndFromBegining");
		hashSet.add("2ndFromEnd");

			System.out.println("List after insertion");

		for(String str1: hashSet)
			System.out.println(str1);*/

	}

	private static void linkedListHandsOn() {
		
		System.out.println("linkedListHandsOn handson============================>");
		List<String> linkedList = new LinkedList<>();	
		Set<String> sortedSet = new TreeSet<>();
		
		linkedList.add("hello");
		linkedList.add("dell");
		linkedList.add("bell");
		linkedList.add("elf");
		linkedList.add("argo");
		linkedList.add("elf");
		linkedList.add("argo");
		linkedList.add(null);
		linkedList.add(null);
	
		System.out.println("Print LinkesList==============>");
		for(String str1: linkedList)
			System.out.println(str1);
	
		//Collections.sort(linkedList, (o1,o2) -> o1.compareTo(o2));
		
		//inser element at 2nd from begining and 2nd from last
	
		linkedList.add(1, "2ndFromBegining");
		linkedList.add(linkedList.size()-1, "2ndFromEnd");
	
			System.out.println("List after insertion");
	
		for(String str1: linkedList)
			System.out.println(str1);
		}
	
		private static void vectorHandsOn() {
			// TODO Auto-generated method stub
			System.out.println("vectorHandsOn handson============================>");
			List<String> arrayList= new Vector<>();
	
			arrayList.add("hello");
			arrayList.add("dell");
			arrayList.add("bell");
			arrayList.add("elf");
			arrayList.add("argo");
			arrayList.add("elf");
			arrayList.add("argo");
			arrayList.add(null);
			arrayList.add(null);
	
			System.out.println("Print VectorList==============>");
			for(String str1: arrayList)
				System.out.println(str1);
	
			//Collections.sort(arrayList, (o1,o2) -> o1.compareTo(o2));
	
			//		
	
			/*System.out.println("Print Sorted VectorList==============>");
			for(String str: arrayList)
				System.out.println(str);
	*/
			//inser element at 2nd from begining and 2nd from last
	
			arrayList.add(1, "2ndFromBegining");
			arrayList.add(arrayList.size()-1, "2ndFromEnd");
	
			System.out.println("VectorList after insertion");
	
			for(String str1: arrayList)
				System.out.println(str1);
	
	}

	private static void arrayListHandsOn() {
		// TODO Auto-generated method stub

		System.out.println("ArrayList handson============================>");
		List<String> arrayList= new ArrayList<>();

		arrayList.add("hello");
		arrayList.add("dell");
		arrayList.add("bell");
		arrayList.add("elf");
		arrayList.add("argo");
		arrayList.add("elf");
		arrayList.add("argo");
		//arrayList.add(null);
		//arrayList.add(null);

		System.out.println("Print LinkesList==============>");
		for(String str1: arrayList)
			System.out.println(str1);

		Collections.sort(arrayList, (o1,o2) -> o1.compareTo(o2));

		//		

		System.out.println("Print Sorted arrayList==============>");
		for(String str: arrayList)
			System.out.println(str);

		//inser element at 2nd from begining and 2nd from last

		arrayList.add(1, "2ndFromBegining");
		arrayList.add(arrayList.size()-1, "2ndFromEnd");

		System.out.println("List after insertion");

		for(String str1: arrayList)
			System.out.println(str1);

	}

}


