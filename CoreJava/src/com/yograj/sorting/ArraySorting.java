package com.yograj.sorting;

public class ArraySorting {

	private static int a[]= {3,1,17,5,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySorting obj = new ArraySorting();
		obj.printSortedArray(a);
	}
	
	public void  printSortedArray(int a[]) {
		int i=0;
		int n=a.length;
		while(a.length>i) {
		int j=i+1;
			while(j<n) {
				if(a[i]> a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j++;
			}
			i++;
			System.out.println("Inside-->" +a);
		}
		for (int num: a) {
			System.out.println(num);
		}
		for (int inum1 = 0; inum1 < a.length; inum1++) 
        {
            System.out.print(a[inum1] + ",");
        }
	}
}
