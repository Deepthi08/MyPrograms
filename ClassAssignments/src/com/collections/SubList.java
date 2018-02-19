package com.collections;


import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Deepu");
		a.add("Anvi");
		a.add("Raj");
		System.out.println("Arraylist"+a);
		List<String> list=a.subList(0, 2);
		System.out.println("Array sublist"+ list);

	}

}
