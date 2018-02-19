package com.classwise;

public class MethSign {
		public void m1(int i)
		{
			System.out.println("helo");
		}	
		
		private void m11(int j)
		{
			System.out.println("hi");
		}
		
	public static void main(String[] args)
	{
		MethSign  a=new MethSign();
		a.m1(10);//CE
		
	}
	}

