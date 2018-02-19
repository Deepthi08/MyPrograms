package com.classwise;

public class AvgArr {
	static double average;
	public static void main(String[] args) {
		//Average=(sum of all elements)/(total no.of elements)
		int[] a= new int[] {10,23,45,65,78};
		int result=0;
		for(int i=0;i<a.length;i++) {
			result=result+a[i];
			average=result/a.length;			
		}
		System.out.println("Average value of array elements:"+average);
	}

}
