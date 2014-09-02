package com.kaiserandi.eulernet;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 * 
 * @author andi
 */
public class Problem03 {

	public static void main(String[] args) {
		long start = 600851475143L;
		for (long i = 3L; i <= start; i++) {
			if (start % i == 0) {
				start = start / i;
				if (isPrime(start))
					System.out.println(start);
			}
		}
	}

	public static boolean isPrime(long p) {
		if (p < 2) {
			return false;
		} else if (p == 2) {
			return true;
		} else {

			/* Versuche number mit der Zahl 2 zu teilen! */

			if (p % 2 == 0) {
				return false;
			}

			/*
			 * Versuche number mit den ungeraden Zahlen von 3 bis sqrt(number)
			 * zu teilen!
			 */

			for (int i = 3; i <= Math.sqrt(p); i = i + 2) {

				if (p % i == 0) { // Teilertest
					return false;
				}
			}
			return true;
		}
	}

}
