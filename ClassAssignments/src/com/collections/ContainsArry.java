package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ContainsArry {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Deepu");
		a1.add("Anvi");
		a1.add("Raj");
		List<String> list=new ArrayList<String>();
		list.add("Anvi");
		System.out.println("Does Arraylist contains all list elements:"+ a1.containsAll(list));
		list.add("One");
		System.out.println("Do Arraylist contain all elements:"+ a1.containsAll(list));
	}
}
