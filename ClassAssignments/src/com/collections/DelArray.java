package com.collections;

import java.util.ArrayList;

public class DelArray {

	public static void main(String[] args) {
		ArrayList<String> d=new ArrayList<String>();
		d.add("JAVA");
		d.add("QTP");
		d.add("Selenium");
		System.out.println("ArrayList before delete:"+d);
		d.clear();
		System.out.println("After deleting:"+d);

	}
}
