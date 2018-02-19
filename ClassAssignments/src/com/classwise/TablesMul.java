package com.classwise;

public class TablesMul {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=10;i++) { //outer loop controls rows
			for(j=1;j<=10;j++) { //inner loops controls columns
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
	}
}
