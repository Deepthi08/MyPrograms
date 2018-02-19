package com.collections;

import java.util.ArrayList;
import java.util.List;

public class AddAll {

	public static void main(String[] args) {
		ArrayList<String> c=new ArrayList<String>();
		c.add("first");
		c.add("second");
		c.add("third");
		c.add("fourth");
		System.out.println(c);
		List<String> d=new ArrayList<String>();
		d.add("Deepu");
		d.add("Anvi");
		c.addAll(d);
		System.out.println(c);

	}

}
