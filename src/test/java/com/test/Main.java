package com.test;

public class Main {
	
	public static String Reverse(String value) {
		String reverse = "";
		for(int i=value.length()-1;i>=0;i--) {
			reverse += value.charAt(i);
		}
		return reverse;
	}
	
	public static boolean isPalindrome(String word) {
		int i = 0;
		int j = word.length()-1;
		while(i<j) {
			if(word.charAt(i)==word.charAt(j)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("kayak"));
		System.out.println(Reverse("cat"));
	}

}
