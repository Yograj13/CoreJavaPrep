package com.yograj.strings;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseString("Hello"));
	}
	public static String reverseString(String s) {
		int sLength=s.length();
		char[] sCharArray = s.toCharArray();
		
		char[] reverseCharArray = sCharArray;
		int len=sLength;
		for(int i=0; i<len;i++) {
			reverseCharArray[len-i-1]=sCharArray[i];
			//System.out.println(reverseCharArray[i]);
		}
		String revrseString=String.valueOf(reverseCharArray);
		System.out.println("revrseString=====>"+revrseString);
		return revrseString;
	}
}
