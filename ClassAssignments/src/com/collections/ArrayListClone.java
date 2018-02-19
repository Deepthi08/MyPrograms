package com.collections;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> b=new ArrayList<String>();
		b.add("Deepu");
		b.add("Anvi");
		b.add("Mom");
		System.out.println("Actual arraylist:"+b);
		ArrayList<String> copy=(ArrayList<String>) b.clone();
		System.out.println("Cloned arraylist:"+copy);

	}

}
