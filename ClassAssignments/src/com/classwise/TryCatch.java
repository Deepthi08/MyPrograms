package com.classwise;

import java.util.Scanner;

public class TryCatch {
	static int n,d,result;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numerator");
		int n=sc.nextInt();
		System.out.println("Enter denominator");
		int d=sc.nextInt();
		try {
			result=n/d;
			System.out.println(result);
		}
		catch(ArithmeticException a) {
			a.printStackTrace();
		}
}
}
