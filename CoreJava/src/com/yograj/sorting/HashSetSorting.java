package com.yograj.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetSorting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortHashSet();
	}
	public static void sortHashSet() {
		Set<String> stringSet = new HashSet<>();
		
		stringSet.add("B");
		stringSet.add("D");
		stringSet.add("A");
		stringSet.add("Z");
		stringSet.add("J");
		stringSet.add("L");
		System.out.println(stringSet);
		
		Collections.sort(new ArrayList(stringSet));
		
		System.out.println("HashSet after Sort!!");
		
		System.out.println(stringSet);
		
		TreeSet<String> tSet= new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		tSet.addAll(stringSet);
		
		System.out.println("Using tree Set");
		System.out.println(tSet);
		
		
	}
}
