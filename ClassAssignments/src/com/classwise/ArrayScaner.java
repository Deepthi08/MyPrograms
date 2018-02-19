package com.classwise;

import java.util.Scanner;

public class ArrayScaner {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=sc.nextInt();
		int [] a=new int[n];
		
		for(int j=0;j<a.length;j++) {
			a[j]=sc.nextInt();
			}
		for(int k=0;k<a.length;k++){
		  sum=sum+a[k];
		}
		System.out.println(sum);
		
	//for(int k=a.length-1;i>=0;i--){
			//System.out.println(a[k]);
		}
	}
