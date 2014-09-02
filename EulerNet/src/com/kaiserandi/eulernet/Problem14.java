package com.kaiserandi.eulernet;

import java.util.ArrayList;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 */
public class Problem14 {
	
	private static long max = 0l;
	private static long startingNumber = 0l;
	private static ArrayList<Long> maxSequence = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (long n = 1000000l; n > 1; n--) {
			ArrayList<Long> sequence = new ArrayList<Long>();
			long i = n;
			while (i != 1){
				if(i % 2 == 0){
					i = evenFunction(i);
				}else{
					i = oddFunction(i);
				}
				sequence.add(i);
			}
			if(sequence.size() > max){
				max = sequence.size();
				startingNumber = n;
				maxSequence = sequence;
			}
			
		}
		System.out.println("Result: Starting Number " + startingNumber + " Length: " + max + "\n" + maxSequence);
	}
	
	private static long evenFunction(long n){
		return n / 2;
	}
	
	private static long oddFunction(long n){
		return 3*n + 1;
	}

}
