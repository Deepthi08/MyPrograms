package com.classwise;

import java.util.Scanner;

public class TrycatchWhile {
	static int n,d,result;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter numerator");
		 n=sc.nextInt();
		System.out.println("Enter denominator");
		 d=sc.nextInt();
		try {
			result=n/d;
			System.out.println(result);
			break;
		}
		catch(ArithmeticException a) {
			a.printStackTrace();
		}
}
}
}

