package com.demo;

public class Demo {

	private static boolean containsNSuccessiveDup(String string, int n) {
		char[] chars = string.toCharArray();
		int count = 1;
		for (int i = 0; i < chars.length - 1; i++) {

			if (chars[i] == chars[i + 1]) {
				count++;
				
			} else {
				/**
				 * count == n : exactly n successive duplicated characters.
				 * count >= n : at least n successive duplicated characters.
				 */
				if (count == n) {
					return true;
				}
				count = 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(containsNSuccessiveDup("ABBDCA", 2));
		System.out.println(containsNSuccessiveDup("BAAABDBB", 3));
		System.out.println(containsNSuccessiveDup("BAABDB", 3));
		System.out.println(containsNSuccessiveDup("CABDDACCCA", 2));
		System.out.println(containsNSuccessiveDup("BAAABDBA", 2));

	}

}
