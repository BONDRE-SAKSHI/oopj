package org.example.main;

import java.util.HashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(101);
		set.add(125);
		set.add(13);
		set.add(314);
		set.add(215);
		set.add(null);
		
		set.add(101);
		set.add(125);
		set.add(13);
		set.add(314);
		set.add(215);
		set.add(null);
		System.out.println(set);	//[null, 101, 215, 314, 125, 13]
	}
	public static void main2(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(101);
		set.add(125);
		set.add(13);
		set.add(314);
		set.add(215);
		System.out.println(set);	//[101, 215, 314, 125, 13]
	}
	public static void main1(String[] args) {
		//HashSet<Integer> set = new HashSet<>();
		Set<Integer> set = new HashSet<>();
	}
}
