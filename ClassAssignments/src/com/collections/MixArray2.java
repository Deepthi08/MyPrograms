package com.collections;

import java.util.ArrayList;

public class MixArray2 {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<Object>();
		a.add("Deepthi");
		a.add(100);
		a.add("Hyd");
		a.add(20);
		System.out.println(a);
		Object a1=a.get(2);
		if(a1 instanceof String) {
			String str=(String)a1;
			System.out.println(str);
			
		}
		else if(a1 instanceof Integer) {
			Integer I=(Integer)a1;
			System.out.println(I);
		}
	}

}
