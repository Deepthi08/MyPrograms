package com.collections;

import java.util.ArrayList;

public class ArraylisToArray {

	public static void main(String[] args) {
		ArrayList<String> b1=new ArrayList<String>();
		b1.add("First");
		b1.add("second");
		b1.add("third");
		b1.add("fourth");
		System.out.println("Arraylist elements:"+b1);
		String[] StrArr=new String[b1.size()];
		b1.toArray(StrArr);
		System.out.println("Created array content:");
		for(String str:StrArr)
		{
			System.out.println(str);
		}

	}

}
