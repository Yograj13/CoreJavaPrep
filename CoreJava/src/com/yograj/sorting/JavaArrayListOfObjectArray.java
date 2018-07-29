package com.yograj.sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayListOfObjectArray {

	public static void main(String[] args) {
		// list of Object arrays to hold different types of array
		List<Object[]> list = new ArrayList<Object[]>();
		String[] arr1 = { "a", "b", "c" };
		String[] arr2 = { "1", "2", "3", "4" };

		JavaArrayListOfObjectArray aa = new JavaArrayListOfObjectArray();
		JavaArrayListOfObjectArray.A[] arr3 = { aa.new A("AA"), aa.new A("BB") };

		list.add(arr1);
		list.add(arr2);
		list.add(arr3);

		// list holds different types of Object arrays, let's print them
		for (Object[] objArr : list) {
			System.out.println(Arrays.toString(objArr));

			// iterating over the array and doing operation based on it's type
			for (Object obj : objArr) {

				// using instanceof keyword to find the Object type in the array
				if (obj instanceof String) {
					// doSomethingForStringObject();
				} else if (obj instanceof JavaArrayListOfObjectArray.A) {
					// doSomethingForAObject();
				}
			}
		}
	}

	/**
	 * A sample class to use in arraylist of arrays
	 * 
	 * @author pankaj
	 * 
	 */
	public class A {
		private String name;

		public A(String n) {
			this.name = n;
		}

		public String getName() {
			return this.name;
		}

		@Override
		public String toString() {
			return "A.class::"+this.name;
		}
	}
}
