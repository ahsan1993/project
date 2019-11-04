package com.ah.String;

public class CompairString {
	
	public static void main(String[] args) {
		
		String s="Gym for life";
		String s1="Gym for life";
		String s2="gym for life";
		String s3=new String(s1);
		String s4="no man can be ";		
		System.out.println("== Operator");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s==s3);
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		
		
		System.out.println("Equals(). Operator");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		

		System.out.println("EqualsIgnorCase(). Operator");
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		

		System.out.println("CompareTo(). Operator");
		System.out.println(s.compareTo(s4));
		
	}

}
