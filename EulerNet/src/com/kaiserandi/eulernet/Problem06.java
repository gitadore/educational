package com.kaiserandi.eulernet;

/**
 * The sum of the squares of the first ten natural numbers is,
 *  1^(2) + 2^(2) + * ... + 10^(2) = 385
 * 
 * The square of the sum of the first ten natural numbers is,#
 * (1 + 2 + ... + * 10)^(2) = 55^(2) = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * @author andi
 */
public class Problem06 {
	/**
	 * We don't need any iteration since we can use some arithmetic sequenses.
	 * (Arithmetische Reihen -> kleiner Gauß im quadrat minus Potenzsummen...)
	 * @param args
	 */
	public static void main(String[] args) {
		long n = 100L;
		long result = 0L;

		result = ((n*(n+1))*(n*(n+1))/4L) - ((n*(n+1)*(2*n+1)) / 6L);
		
		System.out.println(result);
	}

}
