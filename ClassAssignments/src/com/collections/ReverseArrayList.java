package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("one");
		a.add("second");
		a.add("third");
		Collections.reverse(a);
		System.out.println("ArrayList after reverse:");
		for(String str:a) {
			System.out.println(str);
		}
	}

}
