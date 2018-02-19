package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListShuffle {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Deepthi");
		a.add("Anvitha");
		a.add("Geetha");
		Collections.reverse(a);
		System.out.println("Shuffled elements");
		for(String str:a) {
			System.out.println(str);
		}
		Collections.reverse(a);
		System.out.println("shuffled elements");
		for(String str:a)
		{
			System.out.println(str);
		}

	}

}
