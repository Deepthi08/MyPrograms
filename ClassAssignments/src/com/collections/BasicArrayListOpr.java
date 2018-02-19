package com.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BasicArrayListOpr {

	public static void main(String[] args) {
		ArrayList<String> b1=new ArrayList<String>();
		b1.add("Selenium");
		b1.add("Manual");
		b1.add("QTP");
		b1.add("JAVA");
		System.out.println(b1);
		//get elements by Index
		System.out.println("Element at Index Zer0:"+b1.get(0));
		System.out.println("Do list contain JAVA:"+b1.contains("JAVA"));
		//add element at specific index
		b1.add(2, "Anvi");
		System.out.println(b1);
		System.out.println("Is arraylist empty:"+b1.isEmpty());
		System.out.println("Index of JAVA:"+b1.indexOf("JAVA"));
		System.out.println("Size of arraylist:"+b1.size());
	}

}
