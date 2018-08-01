package com.yograj.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mixing generic and non-generic code--works fine. Only while casting we face issue
		
		
		List list = new ArrayList();
		list.add(new Integer(12));
		list.add("string");
		list.add(new Boolean(false));
		
		List<Integer> arrayListofString = new ArrayList<>();
		arrayListofString.add(12);
		arrayListofString.add(32);
		arrayListofString.add(172);
		arrayListofString.addAll(list);
		list.addAll(arrayListofString);
		list.sort((o1,o2) -> o1.toString().compareTo(o2.toString()));
		System.out.println(list);
		arrayListofString.sort((n1,n2) -> n1.compareTo(n2)); //------------------here all elements in arrayList are not Integer thus we get class-cast exception
		System.out.println(arrayListofString);

	}

}
