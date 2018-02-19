package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratotArrList {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			a1.add(i);
		}
		Iterator<Integer> a2=a1.iterator();
		while(a2.hasNext()) {
			Integer I=a2.next();
			if(I%2==0) 
				System.out.println(I);
			else
				a2.remove();
			}
		System.out.println(a1);
			}
	}


