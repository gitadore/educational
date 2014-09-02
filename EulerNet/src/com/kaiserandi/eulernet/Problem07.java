package com.kaiserandi.eulernet;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6^(th) prime is 13.
 * 
 * What is the 10001^(st) prime number?
 * 
 * @author andi
 * 
 */
public class Problem07 {

	/**
	 * we can use the isPrime(long p) from Problem3.java
	 * @param args
	 */
	public static void main(String[] args) {

		//inc. when we find a prime
		int counter = 1;
		long prime = 0L;
		while (counter <= 10001){
			if(Problem03.isPrime(prime)){
				System.out.println(counter + ": " + prime);
				counter++;
			}
			prime++;
		}
	}

}
