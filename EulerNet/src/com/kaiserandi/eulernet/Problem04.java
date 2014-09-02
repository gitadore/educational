package com.kaiserandi.eulernet;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 � 99. Find the largest
 * palindrome made from the product of two 3-digit numbers.
 * 
 * @author andi
 */
public class Problem04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long result = 0L;
		for (int j = 0; j < 100; j++) {
			for (int i = 0; i < 100; i++) {
				result = (999 - j) * (999 - i);
				if (result - reverseLong(result) == 0) {
					System.out.println("largest palindrom with 3-digits:");
					System.out.println(result + " = " + (999 - j) + " * "
							+ (999 - i));
					j = 99;
					break;
				}
			}
		}

	}

	private static long reverseLong(long l) {
		StringBuffer str_Long = new StringBuffer(Long.toString(l));
		str_Long = str_Long.reverse();
		return Long.valueOf(str_Long.toString());
	}
}
