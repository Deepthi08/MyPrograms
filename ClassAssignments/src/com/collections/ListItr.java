package com.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItr {

	public static void main(String[] args) {
		LinkedList<String> b=new LinkedList<>();
		b.add("Deepu");
		b.add("Lav");
		b.add("Preeti");
		System.out.println(b);
		ListIterator<String> b1=b.listIterator();
		while(b1.hasNext())
		{
			String  s=b1.next();
			if (s.equals("Lav"))
				b1.set("Anvitha");
		}
		System.out.println(b);
	}
}
