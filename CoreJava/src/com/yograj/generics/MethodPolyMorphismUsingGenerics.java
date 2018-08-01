package com.yograj.generics;

import java.util.ArrayList;
import java.util.List;

public class MethodPolyMorphismUsingGenerics {

	public static void main(String[] args) {
		List<A> arrayListOfA = new ArrayList<>();
		
		arrayListOfA.add(new B());
		arrayListOfA.add(new C());
		
		printMain(arrayListOfA);
	}
	
	public static void printMain(List<? extends A> list) {
		for(A a: list) {
			a.print();
		}
	}
}

class A{
	public void print() {
		System.out.println("A class method invoked");
	}
}

class B extends A{
	public void print() {
		System.out.println("B class method invoked");
	}
}
class C extends B{
	public void print() {
		System.out.println("C class method invoked");
	}
}