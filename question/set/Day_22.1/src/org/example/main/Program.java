package org.example.main;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();	//Upcasting
		set.add(50);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(40);
		set.add(null);	//NullPointerException
		
		System.out.println( set );
	}
	public static void main2(String[] args) {
		Set<Integer> set = new TreeSet<>();	//Upcasting
		set.add(50);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(40);
		System.out.println( set );	//[10, 20, 30, 40, 50]
	}
	public static void main1(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		Set<Integer> set = new TreeSet<>();	//Upcasting
		
		Collection<Integer> collection = new TreeSet<>();	//Upcasting
	}
}
