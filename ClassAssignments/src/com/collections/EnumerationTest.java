package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		for(int i=1;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration<Integer> e1=v.elements();
		while(e1.hasMoreElements()) {
			Integer i=e1.nextElement();
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println(v);	
	}
}
