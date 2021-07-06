package com.test;

public class Main {
	
	public static String Reverse(String value) {
		String reverse = "";
		for(int i=value.length()-1;i>=0;i--) {
			reverse += value.charAt(i);
		}
		return reverse;
	}
	

	public static void swap(int x, int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("x is now "+x);
		System.out.println("y is now "+y);
	}
	public static void main(String[] args) {
		swap(10,20);
		
		System.out.println(Reverse("cat"));
	}

}
