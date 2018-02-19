package com.classwise;

public class TwoDim {

	public static void main(String[] args) {
		String[][] names= {{"Deepu","Anvi"},{"Raj","Aish"}};
		int[][] a=new int[2][2];
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(names[i][j]);
			}

				
		}

	}

}
