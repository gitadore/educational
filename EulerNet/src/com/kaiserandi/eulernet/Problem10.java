package com.kaiserandi.eulernet;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * @author andi
 * 
 */
public class Problem10 {

	/**
	 * we can use isPrime from Problem3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long end = 2000000L;
		long endsum = 0L;
		for (long i = 0; i < end; i++) {
			if(Problem03.isPrime(i))
				endsum += i;
		}
		System.out.println(endsum);
	}

}
